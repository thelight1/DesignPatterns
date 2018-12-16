package com.thelight1.proxy.example;

public class Main {

    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl("小静");
        GiveGift proxy = new Proxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
/**
 运行输出如下：
 [追求者]送给[小静]洋娃娃
 [追求者]送给[小静]鲜花
 [追求者]送给[小静]巧克力
 */
