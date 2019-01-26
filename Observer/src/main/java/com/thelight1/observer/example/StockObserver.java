package com.thelight1.observer.example;

/**
 * Created by zhanghan18 on 26/01/2019.
 */
public class StockObserver {
    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update(Event event) {
        System.out.println("StockObserver["+ this.name +"] receive event["+ event.getMessage() +"], and invoke update()");
    }
}
