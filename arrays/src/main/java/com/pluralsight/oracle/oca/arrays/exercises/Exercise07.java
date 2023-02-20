package com.pluralsight.oracle.oca.arrays.exercises;

import java.util.Arrays;

public class Exercise07 {

    // This method should return true if the array is sorted, and false otherwise.
    // Note: The method must not modify the argument array.
    public boolean isSorted(int[] array) {
        // TODO: Use methods of class java.util.Arrays to determine if the array is sorted.
        // API documentation of class Arrays: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
        //
        // Hint: One way to do this is by making a copy of the array, sorting the copy and then checking if the original
        // and the sorted copy are equal. Implement this without loops; use methods of class Arrays.

        int [] copy = Arrays.copyOf(array,array.length);
        Arrays.sort(copy);
        return Arrays.equals(array,copy);
    }
}
