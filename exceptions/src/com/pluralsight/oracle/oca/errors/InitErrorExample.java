package com.pluralsight.oracle.oca.errors;

public class InitErrorExample {

    static int n = 2 / 0 ;
    static {
        // cause 2
        int n = 1;
        if (n < 2)
            throw new IllegalArgumentException();
    }

    public static void main(String[] args) {

    }
}
