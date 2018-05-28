package cn.imcompany.simple;

/**
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simp = new SimpleFactory();
        System.out.println(simp.getBeer("青岛"));
    }

}
