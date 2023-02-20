package com.pluralsight.oracle.oca.arrays.test;

import com.pluralsight.oracle.oca.arrays.exercises.Exercise04;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {

    @Test
    @DisplayName("Exercise 4: Reverse an array")
    void reverseArray() {
        char[] arg = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        char[] result = new Exercise04().reverseArray(arg);

        assertNotNull(result, "The method returned 'null'.");
        assertEquals(10, result.length, "The array that the method returned was the wrong length.");
        assertArrayEquals(new char[]{'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'}, result, "The array that the method returned did not contain the expected elements.");
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'}, arg, "The method modified the array 'arg'. Rewrite your code so that it does not modifies the array that is passed to the method.");
    }
}
