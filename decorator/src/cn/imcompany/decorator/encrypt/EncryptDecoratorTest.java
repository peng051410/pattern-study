package cn.imcompany.decorator.encrypt;

/**
 * Created by tomyli on 2018/6/25.
 * Github: https://github.com/peng051410
 */
public class EncryptDecoratorTest {

    public static void main(String[] args) {

        Encryptor encryptor = new ConcreteEncryptor();
        //进行一次简单加密
        Encryptor encryptDecorator = new SimpleEncryptDecorator(encryptor);
        encryptDecorator.encrypt();

        //对上一次加密进行二次加密（反转加密）
        ConverseEncryptDecorator converseEncryptDecorator = new ConverseEncryptDecorator(encryptDecorator);
        converseEncryptDecorator.encrypt();
    }
}
