package cn.imcompany.function;

import cn.imcompany.Beer;
import cn.imcompany.QingDao;

/**
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public class QinDaoFactory extends BeerFactory {

    @Override
    public Beer getBeer() {
        return new QingDao();
    }
}
