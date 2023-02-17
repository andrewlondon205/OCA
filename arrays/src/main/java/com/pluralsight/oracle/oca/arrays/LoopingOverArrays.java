package com.pluralsight.oracle.oca.arrays;

public class LoopingOverArrays {

    public static void main(String[] args) {

        int [] integers = {2,4,6,8};

        for (int i=0; i < integers.length; i++)
            System.out.println("The element at index " + i + " is: " + integers[i]);

        int sum = 0;
        for (int element : integers)
            sum += element;

        System.out.println("The sum is: " + sum );

    }
}
