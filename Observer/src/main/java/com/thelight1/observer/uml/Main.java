package com.thelight1.observer.uml;

/**
 * Created by zhanghan18 on 26/01/2019.
 */
public class Main {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        concreteSubject.addObserver(new ConcreteObserver("xiaolei", concreteSubject));
        concreteSubject.addObserver(new ConcreteObserver("xiaoming", concreteSubject));

        concreteSubject.setState("名字从a到了b");
        concreteSubject.notifyObservers();
    }
}
/**
 *输出如下：
 ConcreteObserver[xiaolei] state is [名字从a到了b]
 ConcreteObserver[xiaoming] state is [名字从a到了b]
 */
