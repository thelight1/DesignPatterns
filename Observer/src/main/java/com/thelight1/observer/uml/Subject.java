package com.thelight1.observer.uml;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhanghan18 on 26/01/2019.
 */
public class Subject {
    private Set<Observer> observers = new HashSet<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.upate();
        }
    }
}
