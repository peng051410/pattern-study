package cn.imcompany.simple;

import java.util.ArrayList;

/**
 * Created by tomyli on 2018/5/30.
 * Github: https://github.com/peng051410
 */
public class SimpleTest {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.name = "apple";
        apple.list = new ArrayList<>();

        try {
            Apple clone = (Apple)apple.clone();
            System.out.println(clone == apple);
            System.out.println(clone.name.equals(apple.name));
            System.out.println(clone.list == apple.list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
