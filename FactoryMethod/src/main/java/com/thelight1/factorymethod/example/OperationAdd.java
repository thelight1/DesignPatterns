package com.thelight1.factorymethod.example;

public class OperationAdd extends Operation {

    @Override
    protected double getResult(double numA, double numB) {
        return numA + numB;
    }
}
