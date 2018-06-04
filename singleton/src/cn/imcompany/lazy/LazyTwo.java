package cn.imcompany.lazy;

/**
 * Created by tomyli on 2018/6/2.
 * Github: https://github.com/peng051410
 */
public class LazyTwo {

    private LazyTwo() {
    }

    private static LazyTwo instance = null;

    public static synchronized LazyTwo getInstance() {
        if (instance == null) {
            instance = new LazyTwo();
        }
        return instance;
    }
}
