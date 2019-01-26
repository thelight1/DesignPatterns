package com.thelight1.factorymethod.example;

public class MinusFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationMinus();
    }
}
