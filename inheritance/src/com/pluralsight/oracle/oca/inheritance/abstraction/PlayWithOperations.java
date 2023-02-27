package com.pluralsight.oracle.oca.inheritance.abstraction;

public class PlayWithOperations {

    public static void main(String[] args) {

        String operation = "4 - 2";
        String [] elements = operation.split(" ");
        int leftOperand = Integer.parseInt(elements[0]);
        int rightOperand = Integer.parseInt(elements[2]);
        String symbol = elements[1];

        Operation op = Operation.of(symbol);
        int result = op.compute(leftOperand,rightOperand);
        System.out.println("result = " + result);
    }
}
