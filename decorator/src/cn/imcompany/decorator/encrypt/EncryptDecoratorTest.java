package cn.imcompany.decorator.encrypt;

/**
 * Created by tomyli on 2018/6/25.
 * Github: https://github.com/peng051410
 */
public class EncryptDecoratorTest {

    public static void main(String[] args) {

        Encryptor encryptor = new ConcreteEncryptor();
        Encryptor encryptDecorator = new SimpleEncryptDecorator(encryptor);
        encryptDecorator.encrypt();
    }
}
