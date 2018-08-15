package cn.imcompany.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by tomyli on 2018/7/9.
 * Github: https://github.com/peng051410
 */
public class JdkProxy implements InvocationHandler {

    private Persion persion;

    public Object getProxy(Persion target) {

        this.persion = target;

        Class<?> aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("start");
        Object o = method.invoke(this.persion, args);
        System.out.println("end");
        return o;
    }
}
