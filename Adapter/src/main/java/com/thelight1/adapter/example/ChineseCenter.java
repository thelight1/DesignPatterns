package com.thelight1.adapter.example;

/**
 * 来自中国的中锋
 */
public class ChineseCenter {

    private String name;

    public ChineseCenter(String name) {
        this.name = name;
    }

    public void jinGong() {
        System.out.println("中国中锋[" + name + "]进攻");
    }

    public void fangshou() {
        System.out.println("中国中锋[" + name + "]防守");
    }
}

