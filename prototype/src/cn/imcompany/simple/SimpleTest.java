package cn.imcompany.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by tomyli on 2018/5/30.
 * Github: https://github.com/peng051410
 */
public class SimpleTest {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.name = "apple";
        apple.weight = 2.23;
        apple.list = new ArrayList<>();

        try {
            Apple clone = (Apple)apple.clone();
            System.out.println(clone == apple);
            System.out.println(clone.list == apple.list);
            System.out.println(clone.name.equals(apple.name));
            System.out.println(clone.weight == apple.weight);
        } catch (Exception e) {
            e.printStackTrace();
        }


        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).collect(Collectors.toList());
        System.out.println(list);
        list.subList(2, 5).clear();
        System.out.println(list);


        String str = "lorem, ipsum, dolor, ";
        str = str.replaceAll(", $", "");
        System.out.println(str);  // "lorem, ipsum, dolor"

    }

}
