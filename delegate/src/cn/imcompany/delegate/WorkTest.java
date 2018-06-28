package cn.imcompany.delegate;

/**
 * Created by tomyli on 2018/6/27.
 * Github: https://github.com/peng051410
 */
public class WorkTest {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.showName();
        boss.showSkill();

        Leader leader = new Leader();
        Member memberA = new DeveloperA();
        Member memberB = new DeveloperB();

        leader.setDeveloperA(memberA);
        leader.setDeveloperB(memberB);

        leader.doWork();

    }
}
