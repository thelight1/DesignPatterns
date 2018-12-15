package com.thelight1.proxy.uml;

/**
 * 定义了Proxy所代表的真正实体
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject invoke request() method");
    }
}
