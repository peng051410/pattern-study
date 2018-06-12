package cn.imcompany.airplane;

/**
 * Created by tomyli on 2018/6/12.
 * Github: https://github.com/peng051410
 */
public class AirPlaneTest {

    public static void main(String[] args) {

        AirPlaneContext context = new AirPlaneContext();
        context.setAirplaneManager(new Fighter());
        context.tackoff();
        context.fly();
    }

}
