package cn.imcompany.adapter;

/**
 * Created by tomyli on 2018/6/22.
 * Github: https://github.com/peng051410
 */
public class LoginServiceAdapter extends LoginService {

    public void qqLogin(String accessToken) {
        login(accessToken, null);
    }

    public void wechatLogin(String accessToken) {
        System.out.println("从微信获取unionId");

        String unionId = "adfsfsfd";
        login(unionId, null);
    }

    public void sinaLogin(String accessToken) {
        login(accessToken, null);
    }
}
