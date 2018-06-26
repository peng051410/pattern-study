package cn.imcompany.decorator.encrypt;

/**
 * Created by tomyli on 2018/6/25.
 * Github: https://github.com/peng051410
 */
public class ConverseEncryptDecorator extends EncryptDecorator {
    public ConverseEncryptDecorator(Encryptor encrypt) {
        super(encrypt);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        converseEncrypt();
    }

    public void converseEncrypt() {
        System.out.println("逆向加密！");
    }
}
