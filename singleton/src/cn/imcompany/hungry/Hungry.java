package cn.imcompany.hungry;

/**
 * Created by tomyli on 2018/6/2.
 * Github: https://github.com/peng051410
 */
public class Hungry {

    private Hungry() {
    }

    private static final Hungry INSTANCE = new Hungry();

    public static Hungry getInstance() {
        return INSTANCE;
    }

}
