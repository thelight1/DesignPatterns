package com.thelight1.chainofresponsibility.uml;

/**
 * Created by zhanghan18 on 2018/12/15.
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
