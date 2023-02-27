package com.pluralsight.oracle.oca.inheritance.conversion;

public class PlayWithPrimitives {

    public static void main(String[] args) {

        int a = 10;
        long b = a;

        a = (int) b;

        float c = 2.2f;
        double d = 2.2;

        int alpha = 20;
        int betha = (int) (a + b);

        short s1 = 10;
        short s2 = 20;
        short s3 = (short) (s1 + s2);
    }
}
