package cn.imcompany.test;

import cn.imcompany.Beer;
import cn.imcompany.QingDao;

/**
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public class FactoryTest {

    public static void main(String[] args) {
        Beer qingDao = new QingDao();
        System.out.println(qingDao.getName());
    }

}
