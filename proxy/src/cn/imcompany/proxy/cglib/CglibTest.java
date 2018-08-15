package cn.imcompany.proxy.cglib;

/**
 * Created by tomyli on 2018/7/12.
 * Github: https://github.com/peng051410
 */
public class CglibTest {

    public static void main(String[] args) {

        XiaoMing xiaoMing = (XiaoMing) new CglibProxy().getInstance(XiaoMing.class);
        xiaoMing.showName("bbbb", 12);
    }
}
