package com.pluralsight.oracle.oca.errors;

public class StackOverflowError {

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate () {
        calculate();
    }
}
