package com.thelight1.factorymethod.example;

public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
