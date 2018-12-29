package com.thelight1.adapter.uml;

/**
 * 通过在内部包装一个Adaptee对象，将源接口转换成目标接口
 */
public class Adapter extends Target{

    private Adaptee adaptee = new Adaptee();

    /**
     * 表面上调用request，实际上调用的是specificRequest
     */
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
