package cn.imcompany.function;

/**
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public class FunctionFactoryTest {

    public static void main(String[] args) {
        FunctionFactory jinShiBaiFactory = new JinShiBaiFactory();
        System.out.println(jinShiBaiFactory.getBeer());
    }

}
