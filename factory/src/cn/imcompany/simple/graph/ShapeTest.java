package cn.imcompany.simple.graph;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class ShapeTest {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();
        circle.erase();

        Shape aaa = ShapeFactory.getShape("aaa");
        
    }

}
