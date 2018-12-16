package com.thelight1.chainofresponsibility.example;

/**
 * 经理
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        //经理只能审批2天及2天以下的请假
        if ("请假".equals(request.getRequestType()) && request.getNumber() <=2) {
            System.out.println("["+ this.name +"]审批了[" + request + "]");
        } else if (this.superior != null) {
            this.superior.handleRequest(request);
        }
    }
}
