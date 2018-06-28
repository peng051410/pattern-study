package cn.imcompany.delegate;

/**
 * Created by tomyli on 2018/6/27.
 * Github: https://github.com/peng051410
 */
public class Boss implements Member {

    private Leader leader;

    public Boss() {
    }

    public Boss(Leader leader) {
        this.leader = leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    @Override
    public void showName() {
        System.out.println("i am boss");
    }

    @Override
    public void showSkill() {
        System.out.println("send commend");
    }

    @Override
    public void doWork() {
    }
}
