package com.pluralsight.oracle.oca.arrays.test;

import com.pluralsight.oracle.oca.arrays.exercises.Exercise03;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {

    @Test
    @DisplayName("Exercise 3: Sum arrays element by element")
    void sumElementByElement() {
        int[] a = {2, 3, 5};
        int[] b = {4, 7, 6};

        int[] result = new Exercise03().sumElementByElement(a, b);

        assertNotNull(result, "The method returned 'null'.");
        assertEquals(3, result.length, "The array that the method returned was the wrong length.");
        assertArrayEquals(new int[]{6, 10, 11}, result, "The array that the method returned did not contain the expected elements.");
        assertArrayEquals(new int[]{2, 3, 5}, a, "The method modified the array 'a'. Rewrite your code so that it does not modifies the arrays that are passed to the method.");
        assertArrayEquals(new int[]{4, 7, 6}, b, "The method modified the array 'b'. Rewrite your code so that it does not modifies the arrays that are passed to the method.");
    }
}
