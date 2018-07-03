package cn.imcompany.proxy;

/**
 * Created by tomyli on 2018/6/28.
 * Github: https://github.com/peng051410
 */
public class Logger {

    public void beforeLog(String username) {
        System.out.println("开始记录" + username + "查询日志");
    }

    public void afterLog(String username) {
        System.out.println("结束记录" + username + "查询日志");
    }
}
