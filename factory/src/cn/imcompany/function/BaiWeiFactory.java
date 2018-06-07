package cn.imcompany.function;

import cn.imcompany.BaiWei;
import cn.imcompany.Beer;

/**
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public class BaiWeiFactory extends FunctionFactory {

    @Override
    public Beer getBeer() {
        return new BaiWei();
    }
}
