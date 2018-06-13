package cn.imcompany.function;

import cn.imcompany.Beer;
import cn.imcompany.JinShiBai;

/**
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public class JinShiBaiFactory extends BeerFactory {

    @Override
    public Beer getBeer() {
        return new JinShiBai();
    }
}
