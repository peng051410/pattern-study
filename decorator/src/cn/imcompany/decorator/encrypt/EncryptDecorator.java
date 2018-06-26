package cn.imcompany.decorator.encrypt;

/**
 * Created by tomyli on 2018/6/25.
 * Github: https://github.com/peng051410
 */
public abstract class EncryptDecorator implements Encryptor {

    private Encryptor encrypt;

    public EncryptDecorator(Encryptor encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public void encrypt() {
       encrypt.encrypt();
    }
}
