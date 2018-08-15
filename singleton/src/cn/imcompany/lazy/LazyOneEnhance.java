package cn.imcompany.lazy;

/**
 * Created by tomyli on 2018/7/7.
 * Github: https://github.com/peng051410
 */
public class LazyOneEnhance {

    private LazyOneEnhance() {
    }

    private static volatile LazyOneEnhance INSTANCE;

    public static LazyOneEnhance getInstance() {

        if (INSTANCE == null) {
            synchronized (LazyOneEnhance.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyOneEnhance();
                }
            }
        }
        return INSTANCE;
    }

}
