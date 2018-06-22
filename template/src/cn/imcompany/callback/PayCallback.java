package cn.imcompany.callback;

import java.util.Map;

/**
 * Created by tomyli on 2018/6/21.
 * Github: https://github.com/peng051410
 */
public abstract class PayCallback {

    public abstract Map<String, String> getParam();

    public abstract boolean checkParam(Map<String, String> param);

    public abstract boolean validSign();

    /**
     * 定义了一个钩子方法来让子类控制流程实现
     * @return true：强制返回，false：不强制返回
     */
    public boolean forceReturn() {

        return false;
    }

    public String doService() {

        Map<String, String> map = getParam();
        if (!checkParam(map)) {
            return "param fail";
        }
        if (!validSign()) {
            return "sign fail";
        }

        if (!map.get("status").equals("success")) {
            if (forceReturn()) {
                return "order fail";
            }
        }

        return "success";
    }
}
