package com.thelight1.proxy.uml;

/**
 * 持有真实实体RealSubject的引用，使得Proxy可以访问真实实体
 * 并实现了Subject接口，这样代理就可以代替真实实体
 */
public class Proxy implements Subject{

    private RealSubject subject;

    public Proxy() {
        this.subject = new RealSubject();
    }

    @Override
    public void request() {
        this.subject.request();
    }
}
