package com.thelight1.chainofresponsibility.example;

/**
 * 申请
 */
public class Request {

    private String requestType; //申请的类别，比如请假、加薪
    private String requestContent; //申请的内容，比如请假原因、加薪原因
    private int number; //数据，比如请假天数，加薪多少

    public Request(String requestType, String requestContent, int number) {
        this.requestType = requestType;
        this.requestContent = requestContent;
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Request{");
        sb.append("requestType='").append(requestType).append('\'');
        sb.append(", requestContent='").append(requestContent).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
