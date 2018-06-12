package cn.imcompany.airplane;

/**
 * Created by tomyli on 2018/6/12.
 * Github: https://github.com/peng051410
 */
public class Fighter implements AirplaneManager {

    public Fighter() {
        System.out.println("歼击机");
    }

    @Override
    public void takeoff() {
        System.out.println("LongDistanceTakeOff");
    }

    @Override
    public void fly() {
        System.out.println("SuperSonicFly");
    }
}
