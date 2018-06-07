package cn.imcompany.abs;

import cn.imcompany.Beer;

/**
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public interface AbstractFactory {

    Beer getQingDao();

    Beer getBaiWei();

    Beer getJinShiBai();
    
}
