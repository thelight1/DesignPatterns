package com.thelight1.factorymethod.example;

public abstract class Operation {
    protected double numA;
    protected double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    protected abstract double getResult(double numA, double numB);

}
