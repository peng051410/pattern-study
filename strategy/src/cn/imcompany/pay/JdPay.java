package cn.imcompany.pay;

/**
 * Created by tomyli on 2018/6/20.
 * Github: https://github.com/peng051410
 */
public class JdPay implements Payment {

    @Override
    public boolean pay(String param) {

        System.out.println("JdPay");
        return true;
    }
}
