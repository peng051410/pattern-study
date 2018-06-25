package cn.imcompany.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tomyli on 2018/6/23.
 * Github: https://github.com/peng051410
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observerList;

    public ConcreteSubject() {
        this.observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public boolean change() {
        return false;
    }

    public void changeYou() {
        observerList.forEach(Observer::show);
    }
}
