package cn.imcompany.pay;

/**
 * Created by tomyli on 2018/6/20.
 * Github: https://github.com/peng051410
 */
public class AliPay implements Payment {

    @Override
    public boolean pay(String param) {

        System.out.println("AliPay");
        return true;
    }
}
