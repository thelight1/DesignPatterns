package com.thelight1.chainofresponsibility.example;

public class Main {

    public static void main(String[] args) {
        Manager commonManager = new CommonManager("王经理");
        Manager majorDomo = new MajorDomo("李总监");
        Manager generalManager = new GeneralManager("张总经理");

        commonManager.setSuperior(majorDomo);
        majorDomo.setSuperior(generalManager);

        //请1天假。（1天假，经理就可以申批）
        Request request1 = new Request("请假", "有事请假", 1);
        commonManager.handleRequest(request1);

        //请3天假。（3天假，经理审批不了，需要总监审批）
        Request request2 = new Request("请假", "有事请假", 3);
        commonManager.handleRequest(request2);

        //请10天假。(10天假，经理、总监都审批不了，需要总经理审批）
        Request request3 = new Request("请假", "有事请假", 10);
        commonManager.handleRequest(request3);
    }
}
/**
 *输出如下：
 [王经理]审批了[Request{requestType='请假', requestContent='有事请假', number=1}]
 [李总监]审批了[Request{requestType='请假', requestContent='有事请假', number=3}]
 [张总经理]审批了[Request{requestType='请假', requestContent='有事请假', number=10}]
 */
