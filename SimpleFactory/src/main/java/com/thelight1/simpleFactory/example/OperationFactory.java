package com.thelight1.simpleFactory.example;

public class OperationFactory {

    public static Operation getOperation(String oper) {
        switch (oper) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationMinus();
            case "*":
                return new OperationMultiply();
            case "/":
                return new OperationDivide();
            default:
                return null;
        }
    }
}
