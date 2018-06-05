package cn.imcompany.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by tomyli on 2018/6/5.
 * Github: https://github.com/peng051410
 */
public class BeanFatory {

    private final static Map<String, Object> singletonMaps = new ConcurrentHashMap<>();

    public static Object getBean(String beanName) {

        if (null == beanName || "".equals(beanName)) {
            throw new RuntimeException("invalid beanName");
        }

        if (!singletonMaps.containsKey(beanName)) {

            try {
                synchronized (singletonMaps) {
                    Object o = Class.forName(beanName).newInstance();
                    singletonMaps.put(beanName, o);
                    return o;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return singletonMaps.get(beanName);
    }

}
