package com.thelight1.factorymethod.example;

public class DivideFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDivide();
    }
}
