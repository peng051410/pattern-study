package cn.imcompany.decorator.encrypt;

/**
 * Created by tomyli on 2018/6/25.
 * Github: https://github.com/peng051410
 */
public class SimpleEncryptDecorator extends EncryptDecorator {

    public SimpleEncryptDecorator(Encryptor encrypt) {
        super(encrypt);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        simpleEncrypt();
    }

    private void simpleEncrypt() {
        System.out.println("简单加密！");
    }
}
