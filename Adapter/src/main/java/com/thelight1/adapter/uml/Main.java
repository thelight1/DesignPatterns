package com.thelight1.adapter.uml;

/**
 * 对于客户端来说，调用的就是target的request
 */
public class Main {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
