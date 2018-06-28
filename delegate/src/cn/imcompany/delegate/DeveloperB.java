package cn.imcompany.delegate;

/**
 * Created by tomyli on 2018/6/27.
 * Github: https://github.com/peng051410
 */
public class DeveloperB implements Member {
    @Override
    public void showName() {
        System.out.println("i am developer b");
    }

    @Override
    public void showSkill() {
        showName();
        System.out.println("i can do pay function");
    }

    public void doWork() {
        showSkill();
        System.out.println("start do pay");
    }
}
