package cn.imcompany.observer;

/**
 * Created by tomyli on 2018/6/23.
 * Github: https://github.com/peng051410
 */
public class ConcreteObserver implements Observer {

    @Override
    public void show() {
        System.out.println("show");
    }
}
