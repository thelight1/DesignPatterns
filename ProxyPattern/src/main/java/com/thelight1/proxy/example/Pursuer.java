package com.thelight1.proxy.example;

/**
 * 女同学的追求者
 */
public class Pursuer implements GiveGift {

    private SchoolGirl girl;

    public Pursuer(SchoolGirl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println("[追求者]送给[" + this.girl.getName() + "]洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println("[追求者]送给[" + this.girl.getName() + "]鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println("[追求者]送给[" + this.girl.getName() + "]巧克力");
    }
}
