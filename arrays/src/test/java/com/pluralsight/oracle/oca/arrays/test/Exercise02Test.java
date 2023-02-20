package com.pluralsight.oracle.oca.arrays.test;

import com.pluralsight.oracle.oca.arrays.exercises.Exercise02;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise02Test {

    @Test
    @DisplayName("Exercise 2: Return the first element of an array")
    void getFirstElement() {
        int[] arg = {2, 3, 4};

        int result = assertDoesNotThrow(() -> new Exercise02().getFirstElement(arg), "The method threw an exception.");
        assertEquals(2, result, "The method did not return the expected result.");

        int result2 = assertDoesNotThrow(() -> new Exercise02().getFirstElement(new int[0]), "The method threw an exception.");
        assertEquals(-1, result2, "The method did not return the expected result.");
    }

    @Test
    @DisplayName("Exercise 2: Return the last element of an array")
    void getLastElement() {
        int[] arg = {2, 3, 4};

        int result = assertDoesNotThrow(() -> new Exercise02().getLastElement(arg), "The method threw an exception.");
        assertEquals(4, result, "The method did not return the expected result.");

        int result2 = assertDoesNotThrow(() -> new Exercise02().getLastElement(new int[0]), "The method threw an exception.");
        assertEquals(-1, result2, "The method did not return the expected result.");
    }
}
