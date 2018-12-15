package com.thelight1.chainofresponsibility.uml;

public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("[" + this.getClass().getSimpleName() + "]处理了请求[" + request + "]");
        } else if (this.successor != null) {
            this.successor.handleRequest(request);
        }
    }
}
