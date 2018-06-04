package cn.imcompany.lazy;

import java.io.Serializable;

/**
 * Created by tomyli on 2018/6/2.
 * Github: https://github.com/peng051410
 */
public class LazyThree implements Serializable, Cloneable {

    private static boolean inintial = false;

    private static LazyThree lazyThree = null;

    // public static boolean isInintial() {
    //     return inintial;
    // }
    //
    // public static void setInintial(boolean inintial) {
    //     LazyThree.inintial = inintial;
    // }

    private LazyThree() {

        synchronized (LazyThree.class) {
            if (!inintial) {
                inintial = true;
            } else {
                throw new RuntimeException("单例被侵犯");
            }
        }
    }


    public static LazyThree getInstance() {
        lazyThree = InstanceHolder.LAZY;
        return lazyThree;
    }

    private static class InstanceHolder {

        private static final LazyThree LAZY = new LazyThree();
    }

    private Object readResolve() {

        if (inintial) {
            return lazyThree;
        }
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return readResolve();
    }
}
