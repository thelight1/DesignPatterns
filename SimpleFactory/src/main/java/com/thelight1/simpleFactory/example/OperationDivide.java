package com.thelight1.simpleFactory.example;

public class OperationDivide extends Operation {

    @Override
    protected double getResult(double numA, double numB) {
        if (Double.compare(numB, 0) == 0) {
            throw new IllegalArgumentException("numB can not be zero!");
        }
        return numA / numB;
    }
}
