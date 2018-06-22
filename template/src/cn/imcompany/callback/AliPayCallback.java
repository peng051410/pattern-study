package cn.imcompany.callback;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tomyli on 2018/6/21.
 * Github: https://github.com/peng051410
 */
public class AliPayCallback extends PayCallback {

    @Override
    public Map<String, String> getParam() {
        Map<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @Override
    public boolean checkParam(Map<String, String> param) {
        return true;
    }

    @Override
    public boolean validSign() {
        return true;
    }
}
