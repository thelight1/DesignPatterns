package com.thelight1.proxy.example;

/**
 * 女同学的追求者不好意思直接给女同学送礼物
 * 于是，追求者委托Proxy这个中间人来给女同学送礼物
 */
public class Proxy implements GiveGift {

    private Pursuer pursuer;

    public Proxy(SchoolGirl girl) {
        this.pursuer = new Pursuer(girl);
    }

    @Override
    public void giveDolls() {
        this.pursuer.giveDolls();
    }

    @Override
    public void giveFlowers() {
        this.pursuer.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        this.pursuer.giveChocolate();
    }
}
