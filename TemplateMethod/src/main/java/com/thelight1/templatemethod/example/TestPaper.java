package com.thelight1.templatemethod.example;

/**
 * 测试试卷类,包含了题目和选项。
 * 学生仅仅填写答案就可以.
 */
public abstract class TestPaper {

    public void testQuestion1() {
        System.out.println("测试题目1: xxxxxx,下面答案正确的是。A.xxxx B.yyyy C.zzzz D.wwww");
        System.out.println("你的答案为：" + answer1());
    }

    public void testQuestion2() {
        System.out.println("测试题目2: xxxxxx,下面答案正确的是。A.xxxx B.yyyy C.zzzz D.wwww");
        System.out.println("你的答案为：" + answer2());
    }

    public void testQuestion3() {
        System.out.println("测试题目3: xxxxxx,下面答案正确的是。A.xxxx B.yyyy C.zzzz D.wwww");
        System.out.println("你的答案为：" + answer3());
    }

    protected abstract String answer1();
    protected abstract String answer2();
    protected abstract String answer3();
}
