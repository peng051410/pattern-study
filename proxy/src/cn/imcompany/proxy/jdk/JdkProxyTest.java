package cn.imcompany.proxy.jdk;

/**
 * Created by tomyli on 2018/7/9.
 * Github: https://github.com/peng051410
 */
public class JdkProxyTest {

    public static void main(String[] args) {

        Persion proxy = (Persion) new JdkProxy().getProxy(new ShoppingGirl());
        proxy.showName();
    }
}
