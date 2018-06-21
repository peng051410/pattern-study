package cn.imcompany.pay;

/**
 * Created by tomyli on 2018/6/20.
 * Github: https://github.com/peng051410
 */
public enum PayType {

    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    JD_PAY(new JdPay()),
    UNICOME_PAY(new UnicomePay()),
    ;

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
