package cn.imcompany.decorator.encrypt;

/**
 * Created by tomyli on 2018/6/25.
 * Github: https://github.com/peng051410
 */
public class ConcreteEncryptor implements Encryptor {

    @Override
    public void encrypt() {
        System.out.println("one encrypt!");
    }
}
