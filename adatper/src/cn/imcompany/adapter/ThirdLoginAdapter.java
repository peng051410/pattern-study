package cn.imcompany.adapter;

/**
 * Created by tomyli on 2018/6/22.
 * Github: https://github.com/peng051410
 */
public class ThirdLoginAdapter implements ThirdLogin {

    private LoginService loginService;

    public ThirdLoginAdapter() {
        this.loginService = new LoginService();
    }

    @Override
    public void wechatLogin(String accessToken) {

        loginService.login(accessToken, null);
    }

    @Override
    public void qqLogin(String accessToken) {

        loginService.login(accessToken, null);
    }

    @Override
    public void sinaLogin(String accessToken) {

        loginService.login(accessToken, null);
    }
}
