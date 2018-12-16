package com.thelight1.chainofresponsibility.example;

/**
 * 总监
 */
public class MajorDomo extends Manager {

    public MajorDomo(String name) {
        super(name);
    }

    @Override
    public void handleRequest(Request request) {
        //总监只能审批1周内的请假
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
            System.out.println("["+ this.name +"]审批了[" + request + "]");
        } else if (this.superior != null) {
            this.superior.handleRequest(request);
        }
    }
}
