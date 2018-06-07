package cn.imcompany.function;

import cn.imcompany.Beer;

/**
 * 定义获取的功能，具体由实现类（具体的啤酒厂）来实现，做到创建与使用隔离
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public abstract class FunctionFactory {

    public abstract Beer getBeer();

}
