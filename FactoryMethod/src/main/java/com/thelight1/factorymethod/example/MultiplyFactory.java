package com.thelight1.factorymethod.example;

public class MultiplyFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationMultiply();
    }
}
