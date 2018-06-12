package cn.imcompany.airplane;

/**
 * Created by tomyli on 2018/6/12.
 * Github: https://github.com/peng051410
 */
public class Harrier implements AirplaneManager {

    public Harrier() {

        System.out.println("鹞式战斗机");
    }

    @Override
    public void takeoff() {
        System.out.println("VerticalTakeOff");
    }

    @Override
    public void fly() {
        System.out.println("SuperSonicFly");
    }
}
