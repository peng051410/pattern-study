package cn.imcompany.lazy;

import java.io.Serializable;

/**
 * Created by tomyli on 2018/6/2.
 * Github: https://github.com/peng051410
 */
public class LazyThree implements Cloneable, Serializable {

    private static boolean initial = false;

    private LazyThree() {

        synchronized (LazyThree.class) {
            if (!initial) {
                initial = true;
            } else {
                throw new RuntimeException("单例被侵犯");
            }
        }
    }

    public static LazyThree getInstance() {
        return InstanceHolder.LAZY;
    }

    private static class InstanceHolder {

        private static final LazyThree LAZY = new LazyThree();
    }

    private Object readResolve() {
        return getInstance();
    }

    // public static boolean isInintial() {
    //     return inintial;
    // }
    //
    // public static void setInintial(boolean inintial) {
    //     LazyThree.inintial = inintial;
    // }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
