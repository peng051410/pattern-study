package cn.imcompany.observer.stock;

/**
 * Created by tomyli on 2018/6/23.
 * Github: https://github.com/peng051410
 */
public interface Buyer {

    void setName(String name);

    String getName();

    void happy();

    void disject();

    void change(Stock stock);
}
