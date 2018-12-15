package com.thelight1.templatemethod.uml;

/**
 * 具体类B
 */
public class ConcreteClassB extends AbstractClass {

    @Override
    protected void primitiveOperation1() {
        System.out.println("具体类B的方法1实现");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("具体类B的方法2实现");
    }
}
