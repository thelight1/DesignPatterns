package com.thelight1.proxy.uml;

/**
 * 定义了RealSubject和Proxy的共同接口，使得在任何使用RealSubject的地方都可以使用Proxy
 */
public interface Subject {

    void request();
}
