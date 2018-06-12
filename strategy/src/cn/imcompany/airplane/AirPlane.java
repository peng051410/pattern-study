package cn.imcompany.airplane;

/**
 * Created by tomyli on 2018/6/12.
 * Github: https://github.com/peng051410
 */
public class AirPlane implements AirplaneManager {

    public AirPlane() {
        System.out.println("客机");
    }

    @Override
    public void takeoff() {
        System.out.println("LongDistanceTakeOff");
    }

    @Override
    public void fly() {
        System.out.println("SubSonicFly");
    }
}
