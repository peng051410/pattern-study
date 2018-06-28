package cn.imcompany.delegate;

/**
 * Created by tomyli on 2018/6/27.
 * Github: https://github.com/peng051410
 */
public class DeveloperA implements Member {
    @Override
    public void showName() {
        System.out.println("i am developer a");
    }

    @Override
    public void showSkill() {
        showName();
        System.out.println("i can do login function");
    }

    public void doWork() {
        showSkill();
        System.out.println("start work login");
    }
}
