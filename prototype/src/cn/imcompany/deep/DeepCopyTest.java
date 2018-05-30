package cn.imcompany.deep;

import java.util.Date;

/**
 * Created by tomyli on 2018/5/30.
 * Github: https://github.com/peng051410
 */
public class DeepCopyTest {

    public static void main(String[] args) throws Exception {

        Car car = new Car();
        car.name = "大众";
        car.tag = "顶配";
        car.birthday = new Date();
        Tire tire = car.tire = new Tire();
        tire.name = "1111";
        tire.brand = "dabai";

        Car copy = car.deepCopy();
        System.out.println(car == copy);
        System.out.println(car.tire == copy.tire);

        Car carFromRefect = car.deepCopyWithReflect();
        System.out.println(carFromRefect == car);
        System.out.println(carFromRefect.tire == car.tire);

    }


}
