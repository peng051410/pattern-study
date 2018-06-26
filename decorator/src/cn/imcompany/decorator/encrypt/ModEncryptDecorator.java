package cn.imcompany.decorator.encrypt;

/**
 * Created by tomyli on 2018/6/25.
 * Github: https://github.com/peng051410
 */
public class ModEncryptDecorator extends EncryptDecorator {
    public ModEncryptDecorator(Encryptor encrypt) {
        super(encrypt);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        modEncrypt();
    }

    public void modEncrypt() {
        System.out.println("取模加密！");
    }
}
