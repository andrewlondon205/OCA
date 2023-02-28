package com.pluralsight.oracle.oca.errors;

public class NoClassDefFoundErrorExample {

    public static void main(String[] args) {

        try {
            new Calculator(); //ExceptionInitializerError
        } catch (Throwable t) {
            System.out.println(t);
        }

        new Calculator();

    }

    public static class Calculator {
        static int undefined = 1 / 0;
    }
}
