package com.pluralsight.oracle.oca.arrays.test;

import com.pluralsight.oracle.oca.arrays.exercises.Exercise07;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise07Test {

    @Test
    @DisplayName("Exercise 7: Check if an array is sorted")
    void isSorted() {
        int[] array1 = {1, 2, 3, 4};
        assertTrue(new Exercise07().isSorted(array1), "The method returned the wrong result.");
        assertArrayEquals(new int[]{1, 2, 3, 4}, array1, "The method modified the argument array.");

        int[] array2 = {1, 3, 2, 4};
        assertFalse(new Exercise07().isSorted(array2), "The method returned the wrong result.");
        assertArrayEquals(new int[]{1, 3, 2, 4}, array2, "The method modified the argument array.");
    }
}
