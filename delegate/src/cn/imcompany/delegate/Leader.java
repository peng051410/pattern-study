package cn.imcompany.delegate;

/**
 * Created by tomyli on 2018/6/27.
 * Github: https://github.com/peng051410
 */
public class Leader implements Member {

    private Member developerA;
    private Member developerB;


    public void setDeveloperA(Member developerA) {
        this.developerA = developerA;
    }

    public void setDeveloperB(Member developerB) {
        this.developerB = developerB;
    }

    @Override
    public void showName() {
        System.out.println("i am leader");
    }

    @Override
    public void showSkill() {

        showName();
        System.out.println("i want to select member to doWork");
    }

    public void doWork(){
        showSkill();
        developerA.doWork();
        developerB.doWork();
    }
}
