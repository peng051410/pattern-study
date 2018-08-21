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

    public void takeoff() {
        airplaneManager.takeoff();
    }

    public void fly() {
        airplaneManager.fly();
    }

}
