package com.thelight1.templatemethod.example;

/**
 * 学生B的试卷
 */
public class TestPaperB extends TestPaper {

    @Override
    protected String answer1() {
        return "B";
    }

    @Override
    protected String answer2() {
        return "B";
    }

    @Override
    protected String answer3() {
        return "B";
    }
}
