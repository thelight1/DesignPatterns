package com.thelight1.observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhanghan18 on 26/01/2019.
 */
public class Secretary {

    private List<StockObserver> observers = new ArrayList<>();
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void addObserver(StockObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(Event event) {
        for (StockObserver observer : this.observers) {
            observer.update(event);
        }
    }
}
