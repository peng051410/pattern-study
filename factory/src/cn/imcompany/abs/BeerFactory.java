package cn.imcompany.abs;

import cn.imcompany.BaiWei;
import cn.imcompany.Beer;
import cn.imcompany.JinShiBai;
import cn.imcompany.QingDao;

/**
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public class BeerFactory implements AbstractFactory {

    @Override
    public Beer getQingDao() {
        return new QingDao();
    }

    @Override
    public Beer getBaiWei() {
        return new BaiWei();
    }

    @Override
    public Beer getJinShiBai() {
        return new JinShiBai();
    }
}
