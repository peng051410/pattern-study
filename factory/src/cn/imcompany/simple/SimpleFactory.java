package cn.imcompany.simple;

import cn.imcompany.BaiWei;
import cn.imcompany.Beer;
import cn.imcompany.JinShiBai;
import cn.imcompany.QingDao;

/**
 * 一个工厂什么都生产,根据传入的参数来返回不的产品
 * Created by tomyli on 2018/5/28.
 * Github: https://github.com/peng051410
 */
public class SimpleFactory {

    public Beer getBeer(String name) {
        if ("青岛".equals(name)) {
            return new QingDao();
        } else if ("百威".equals(name)) {
            return new BaiWei();
        } else if ("金士百".equals(name)) {
            return new JinShiBai();
        } else {
            System.out.println("没有这种啤酒");
            return null;
        }
    }

}
