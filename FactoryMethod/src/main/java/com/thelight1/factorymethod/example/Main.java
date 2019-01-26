package com.thelight1.factorymethod.example;

public class Main {

    public static void main(String[] args) {
        double numA = 8000;
        double numB = 1000;

        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        double result = operation.getResult(numA, numB);
        System.out.println(result);
    }
}
