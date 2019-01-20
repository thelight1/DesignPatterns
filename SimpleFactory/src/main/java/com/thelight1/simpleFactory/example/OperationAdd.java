package com.thelight1.simpleFactory.example;

public class OperationAdd extends Operation {

    @Override
    protected double getResult(double numA, double numB) {
        return numA + numB;
    }
}
