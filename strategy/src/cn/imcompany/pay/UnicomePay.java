package cn.imcompany.pay;

/**
 * Created by tomyli on 2018/6/20.
 * Github: https://github.com/peng051410
 */
public class UnicomePay implements Payment {

    @Override
    public boolean pay(String param) {

        System.out.println("UnicomePay");
        return true;
    }
}
