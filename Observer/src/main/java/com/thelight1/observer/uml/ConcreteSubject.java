package com.thelight1.observer.uml;

/**
 * Created by zhanghan18 on 26/01/2019.
 */
public class ConcreteSubject extends Subject{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
