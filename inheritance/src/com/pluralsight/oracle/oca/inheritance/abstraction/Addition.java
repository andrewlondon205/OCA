package com.pluralsight.oracle.oca.inheritance.abstraction;

public class Addition extends Operation{
    @Override
    public int compute (int a, int b) {
        return a + b;
    }
}
