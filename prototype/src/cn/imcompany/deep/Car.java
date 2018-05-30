package cn.imcompany.deep;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by tomyli on 2018/5/30.
 * Github: https://github.com/peng051410
 */
public class Car implements Serializable {

    public String name;
    public String tag;
    public Date birthday;

    public Tire tire;

    public Car deepCopy() throws Exception {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Car copy = (Car) ois.readObject();
        copy.birthday = new Date();
        return copy;

    }

    public Car deepCopyWithReflect() throws Exception {

        Class<? extends Car> aClass = this.getClass();
        Car car = aClass.newInstance();
        Class<? extends Car> desCarClass = car.getClass();

        Field[] fields = aClass.getDeclaredFields();
        if (fields != null) {

            Arrays.stream(fields).forEach(field -> {
                field.setAccessible(true);
                try {
                    String name = field.getName();
                    String firstUpper = firstUpper(name);

                    String setMethodName = "set" + firstUpper;
                    Method method = desCarClass.getMethod(setMethodName, field.getType());
                    method.invoke(car, field.get(this));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        return car;
    }

    private String firstUpper(String filed) {
        char[] chars = filed.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }
}
