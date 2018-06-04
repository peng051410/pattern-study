package cn.imcompany.lazy;

/**
 * 简单懒汉模式，存在线程安全问题
 * Created by tomyli on 2018/6/2.
 * Github: https://github.com/peng051410
 */
public class LazyOne {

    private LazyOne() {
    }

    private static LazyOne instance = null;

    public static LazyOne getInstance() {
        if (instance == null) {
            System.out.println("no no no ");
            instance = new LazyOne();
        }
        return instance;
    }
}
