package com.thelight1.chainofresponsibility.example;

/**
 * 总经理
 */
public class GeneralManager extends Manager{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        //总经理可以处理任意天数的请假
        if ("请假".equals(request.getRequestType())) {
            System.out.println("["+ this.name +"]审批了[" + request + "]");
        } else if (this.superior != null) {
            this.superior.handleRequest(request);
        }
    }
}
