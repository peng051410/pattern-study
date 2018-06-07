package cn.imcompany.simple.graph;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class ShapeFactory {

    public static Shape getShape(String name) {

        if ("circle".equals(name)) {
            return new Circle();
        } else if ("rectangle".equals(name)) {
            return new Rectangle();
        } else if ("triangle".equals(name)) {
            return new Triangle();
        } else {
            throw new UnsupportedShapeException("没有此形状");
        }
    }

}
