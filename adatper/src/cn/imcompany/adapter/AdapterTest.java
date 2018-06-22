package cn.imcompany.adapter;

/**
 * Created by tomyli on 2018/6/22.
 * Github: https://github.com/peng051410
 */
public class AdapterTest {

    public static void main(String[] args) {

        ThirdLogin thirdLogin = new ThirdLoginAdapter();
        thirdLogin.qqLogin("qq123456");

        LoginServiceAdapter loginServiceAdapter = new LoginServiceAdapter();
        loginServiceAdapter.wechatLogin("weixin_88888");
    }
}
