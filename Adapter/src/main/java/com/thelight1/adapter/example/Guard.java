package com.thelight1.adapter.example;

/**
 * 后卫
 */
public class Guard extends Player {

    public Guard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫[" + name + "]进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫[" + name + "]防守");
    }
}


