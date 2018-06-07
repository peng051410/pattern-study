package cn.imcompany.simple.graph;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle draw");
    }

    @Override
    public void erase() {

        System.out.println("Rectangle erase");
    }
}
