package com.thelight1.observer.example;

/**
 * Created by zhanghan18 on 26/01/2019.
 */

/**
 * 此模式还未完成
 */
public class Main {

    public static void main(String[] args) {
        Secretary secretary = new Secretary();

        StockObserver stockObserver1 = new StockObserver("小李", secretary);
        StockObserver stockObserver2 = new StockObserver("小王", secretary);

        secretary.addObserver(stockObserver1);
        secretary.addObserver(stockObserver2);

        Event event = new Event("你好");
        secretary.notifyObservers(event);
    }
}
