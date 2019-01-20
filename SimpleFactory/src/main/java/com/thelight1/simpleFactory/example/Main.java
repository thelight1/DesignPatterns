package com.thelight1.simpleFactory.example;


public class Main {

    public static void main(String[] args) {
        double numA = 8000;
        double numB = 1000;
        /**
         * 根据提供的operation的不同，执行不同的运算
         */
        String oper = "+";
        double result;
        Operation operation;
        operation = OperationFactory.getOperation(oper);
        result = operation.getResult(numA, numB);
        System.out.println(result);

        oper = "-";
        operation = OperationFactory.getOperation(oper);
        result = operation.getResult(numA, numB);
        System.out.println(result);

        oper = "*";
        operation = OperationFactory.getOperation(oper);
        result = operation.getResult(numA, numB);
        System.out.println(result);

        oper = "/";
        operation = OperationFactory.getOperation(oper);
        result = operation.getResult(numA, numB);
        System.out.println(result);
    }
}
/**
 * 运行结果
 *
 9000.0
 7000.0
 8000000.0
 8.0
 */
