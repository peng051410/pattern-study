package cn.imcompany.simple;

import java.util.List;

/**
 * Created by tomyli on 2018/5/30.
 * Github: https://github.com/peng051410
 */
public class Apple implements Cloneable {

    public String name;
    public double weight;
    public List<Stone> list;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
