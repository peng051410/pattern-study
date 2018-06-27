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

        System.out.println("微信获取用户信息");
        loginService.login(accessToken, null);
    }

    @Override
    public void qqLogin(String accessToken) {

        System.out.println("qq获取用户信息");
        loginService.login(accessToken, null);
    }

    @Override
    public void sinaLogin(String accessToken) {

        System.out.println("微博获取用户信息");
        loginService.login(accessToken, null);
    }
}
