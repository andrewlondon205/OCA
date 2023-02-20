package com.pluralsight.oracle.oca.arrays;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int [] numbers1 = {16,23,30};

        int [] numbers2 = Arrays.copyOf(numbers1,4);
        System.out.println(Arrays.toString(numbers2));

        int [] numbers3 = Arrays.copyOfRange(numbers2,1,3);
        System.out.println(Arrays.toString(numbers3));

        int [] numbers4 = new int[6];
        System.arraycopy(numbers2,0,numbers4,0,4);
        System.arraycopy(numbers3,0,numbers4,4,2);

        System.out.println(Arrays.toString(numbers4));

        Arrays.sort(numbers4);
        System.out.println(Arrays.toString(numbers4));

        int index = Arrays.binarySearch(numbers4,23);
        System.out.println("Found 23 at index: " + index);


    }
}
