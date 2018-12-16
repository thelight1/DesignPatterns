package com.thelight1.templatemethod.uml;

public class Main {

    public static void main(String[] args) {
        AbstractClass c;

        c = new ConcreteClassA();
        c.templateMethod();

        System.out.println("----------------");

        c = new ConcreteClassB();
        c.templateMethod();
    }
}
/**
 *
 输出如下：
 具体类A的方法1实现
 具体类A的方法2实现
 这里是算法骨架中的一些共用的操作
 ----------------
 具体类B的方法1实现
 具体类B的方法2实现
 这里是算法骨架中的一些共用的操作
 */
