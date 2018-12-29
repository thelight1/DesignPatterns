package com.thelight1.adapter.example;

/**
 * 翻译官
 * 因为中国的中锋来到NBA后，听不懂英语，没法理解教练的战术，所以需要一个翻译官。
 * 翻译官将attack翻译为jinGong后告诉中国中锋球员，
 * 将defense翻译为fangshou后告诉中国中锋球员。
 */
public class Translator extends Player {

    private ChineseCenter chineseCenter;

    public Translator(String name) {
        super(name);
        this.chineseCenter = new ChineseCenter(name);
    }

    @Override
    public void attack() {
        this.chineseCenter.jinGong();
    }

    @Override
    public void defense() {
        this.chineseCenter.fangshou();
    }
}
