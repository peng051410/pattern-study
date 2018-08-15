package cn.imcompany.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by tomyli on 2018/7/12.
 * Github: https://github.com/peng051410
 */
public class CglibProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.out.println("start");

        for (Object arg : args) {
            System.out.println(arg.getClass());
        }

        System.out.println(Arrays.toString(args));
        System.out.println(method.getName());
        Object invoke = proxy.invokeSuper(obj, args);

        System.out.println("end ");
        return null;
    }
}
