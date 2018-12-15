package com.thelight1.chainofresponsibility.uml;

/**
 * Created by zhanghan18 on 2018/12/15.
 */
public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("[" + this.getClass().getSimpleName() + "]处理了请求[" + request + "]");
        } else if (this.successor != null) {
            this.successor.handleRequest(request);
        }
    }
}
