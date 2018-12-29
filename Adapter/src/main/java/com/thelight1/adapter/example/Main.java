package com.thelight1.adapter.example;

public class Main {

    public static void main(String[] args) {
        Player b = new Forward("巴蒂尔");
        b.attack();

        Player m = new Guard("麦迪");
        m.attack();

        /**
         * 翻译官告诉姚明，要进攻。
         */
        Player ym = new Translator("姚明");
        ym.attack();
    }
}
/**
 * 运行输出如下
 前锋[巴蒂尔]进攻
 后卫[麦迪]进攻
 中国中锋[姚明]进攻
 *
 * */