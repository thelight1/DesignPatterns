package com.thelight1.templatemethod.example;

/**
 * 学生A的试卷
 */
public class TestPaperA extends TestPaper {

    @Override
    protected String answer1() {
        return "A";
    }

    @Override
    protected String answer2() {
        return "A";
    }

    @Override
    protected String answer3() {
        return "A";
    }
}
