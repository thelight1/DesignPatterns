package com.thelight1.adapter.example;

/**
 * NBA球员类，可以进攻或防守。
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract  void defense();
}
