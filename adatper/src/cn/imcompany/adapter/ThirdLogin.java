package cn.imcompany.adapter;

/**
 * Created by tomyli on 2018/6/22.
 * Github: https://github.com/peng051410
 */
public interface ThirdLogin {

    void wechatLogin(String accessToken);

    void qqLogin(String accessToken);

    void sinaLogin(String accessToken);
}
