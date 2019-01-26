package com.thelight1.observer.uml;

/**
 * Created by zhanghan18 on 26/01/2019.
 */
public class ConcreteObserver implements Observer {

    private String name;
    private String state;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void upate() {
        /**
         * 观察者的状态根据主题的状态做更新
         */
        this.state = subject.getState();
        System.out.println("ConcreteObserver[" + name + "] state is [" + this.state + "]");
    }
}
