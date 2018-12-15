package com.thelight1.templatemethod.example;

public class Client {

    public static void main(String[] args) {
        TestPaper testPaperA = new TestPaperA();
        testPaperA.testQuestion1();
        testPaperA.testQuestion2();
        testPaperA.testQuestion3();

        System.out.println("-------------------------------------");

        TestPaper testPaperB = new TestPaperB();
        testPaperB.testQuestion1();
        testPaperB.testQuestion2();
        testPaperB.testQuestion3();
    }
}
/**
 *输出如下：
 测试题目1: xxxxxx,下面答案正确的是。A.xxxx B.yyyy C.zzzz D.wwww
 你的答案为：A
 测试题目2: xxxxxx,下面答案正确的是。A.xxxx B.yyyy C.zzzz D.wwww
 你的答案为：A
 测试题目3: xxxxxx,下面答案正确的是。A.xxxx B.yyyy C.zzzz D.wwww
 你的答案为：A
 -------------------------------------
 测试题目1: xxxxxx,下面答案正确的是。A.xxxx B.yyyy C.zzzz D.wwww
 你的答案为：B
 测试题目2: xxxxxx,下面答案正确的是。A.xxxx B.yyyy C.zzzz D.wwww
 你的答案为：B
 测试题目3: xxxxxx,下面答案正确的是。A.xxxx B.yyyy C.zzzz D.wwww
 你的答案为：B
 */
