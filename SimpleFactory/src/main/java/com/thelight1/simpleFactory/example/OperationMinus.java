package com.thelight1.simpleFactory.example;

public class OperationMinus extends Operation {

    @Override
    protected double getResult(double numA, double numB) {
        return numA - numB;
    }
}
