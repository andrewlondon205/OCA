package com.pluralsight.oracle.oca.arrays.test;

import com.pluralsight.oracle.oca.arrays.exercises.Exercise05;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise05Test {

    @Test
    @DisplayName("Exercise 5: Count the number of zeroes in an array")
    void countZeroes() {
        assertEquals(0, new Exercise05().countZeroes(new int[]{-1, 2, -3, 4}), "The method returned the wrong result.");
        assertEquals(1, new Exercise05().countZeroes(new int[]{1, -2, 0, 4}), "The method returned the wrong result.");
        assertEquals(2, new Exercise05().countZeroes(new int[]{-1, 0, -3, 0}), "The method returned the wrong result.");
        assertEquals(20, new Exercise05().countZeroes(new int[20]), "The method returned the wrong result.");
        assertEquals(0, new Exercise05().countZeroes(new int[0]), "The method returned the wrong result.");
    }
}
