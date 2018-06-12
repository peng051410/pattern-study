package cn.imcompany.airplane;

/**
 * Created by tomyli on 2018/6/12.
 * Github: https://github.com/peng051410
 */
public class AirPlaneContext {

    private AirplaneManager airplaneManager;

    public void setAirplaneManager(AirplaneManager airplaneManager) {
        this.airplaneManager = airplaneManager;
    }

    public void tackoff() {
        airplaneManager.tackoff();
    }

    public void fly() {
        airplaneManager.fly();
    }

}
