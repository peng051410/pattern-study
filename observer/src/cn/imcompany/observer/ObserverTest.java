package cn.imcompany.observer;

/**
 * Created by tomyli on 2018/6/23.
 * Github: https://github.com/peng051410
 */
public class ObserverTest {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        Observer concreteObserver = new ConcreteObserver();
        Observer concreteObserver2 = new ConcreteObserver2();

        subject.addObserver(concreteObserver);
        subject.addObserver(concreteObserver2);

        subject.changeYou();
    }
}
