package com.pluralsight.oracle.oca.arrays;

import java.util.Arrays;

public class ArrayObjects {

    public static void main(String[] args) {
        int[] numbers = {16, 23, 30, 41};
        int[] alpha = {19, 11, 1999};
        int[] betha = {19, 11, 1999};

        String[] names = {"Susan", "John", "Betty", "Mark"};

        String c1 = numbers.getClass().getName();
        String c2 = names.getClass().getName();

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("Is numbers an object? " + (numbers instanceof Object));

        // comparing objects
        boolean result = alpha.equals(betha);
        boolean flag = Arrays.equals(alpha, betha);

        System.out.println("Are they equal? " + result);
        System.out.println("Are they equal? " + flag);

        System.out.println(alpha.hashCode());
        System.out.println(betha.hashCode());

        System.out.println(Arrays.hashCode(alpha));
        System.out.println(Arrays.hashCode(betha));

    }
}
