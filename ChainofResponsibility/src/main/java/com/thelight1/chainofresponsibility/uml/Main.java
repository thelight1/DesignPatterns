package com.thelight1.chainofresponsibility.uml;

public class Main {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] reqeusts = new int[]{1, 2, 12, 22, 32};
        for (int i = 0; i < reqeusts.length; i++) {
            handler1.handleRequest(reqeusts[i]);
        }
    }
}
/**
 * 输出如下：
 [ConcreteHandler1]处理了请求[1]
 [ConcreteHandler1]处理了请求[2]
 [ConcreteHandler2]处理了请求[12]
 [ConcreteHandler3]处理了请求[22]
 */
