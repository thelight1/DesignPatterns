package com.thelight1.templatemethod.uml;

/**
 * 实现了一个模板方法，定义了算法的骨架。
 * 具体子类将重新定义primitiveMethod()以实现一个算法的步骤
 *
 * 注意：是抽象类，不是接口。
 * 为什么不是接口？因为templateMethod()方法有具体的方法体。
 */
public abstract class AbstractClass {

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("这里是算法骨架中的一些共用的操作");
    }

    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();
}
