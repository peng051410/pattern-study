package cn.imcompany.airplane;

/**
 * Created by tomyli on 2018/6/12.
 * Github: https://github.com/peng051410
 */
public class Helicopter implements AirplaneManager {

    public Helicopter() {
        System.out.println("直升机");
    }

    @Override
    public void takeoff() {
        System.out.println("VerticalTakeOff");
    }

    @Override
    public void fly() {
        System.out.println("SubSonicFly");
    }
}
