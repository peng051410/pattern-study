package cn.imcompany.proxy;

/**
 * Created by tomyli on 2018/6/28.
 * Github: https://github.com/peng051410
 */
public class Auth {

    public boolean valid(String username) {

        return "admin".equals(username);
    }
}
