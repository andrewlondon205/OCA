package com.pluralsight.oracle.oca.inheritance.abstraction;

public abstract class Operation {

    public abstract int compute(int a, int b);
    public static Operation of (String symbol) {
        switch (symbol) {
            case "+" : return new Addition();
            case "-" : return new Subtraction();
            default: throw new IllegalStateException("Symbol " + symbol + " is unknown");
        }
    }
}
