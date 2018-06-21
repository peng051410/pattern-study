package cn.imcompany.pay;

/**
 * Created by tomyli on 2018/6/20.
 * Github: https://github.com/peng051410
 */
public class PayTest {

    public static void main(String[] args) {

        PayType.ALI_PAY.getPayment().pay("123");

        PayType.valueOf(PayType.WECHAT_PAY.toString()).getPayment().pay("325");
    }

}
