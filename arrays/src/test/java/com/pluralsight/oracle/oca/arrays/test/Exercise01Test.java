package com.pluralsight.oracle.oca.arrays.test;

import com.pluralsight.oracle.oca.arrays.exercises.Exercise01;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {

    @Test
    @DisplayName("Exercise 1: Create and initialize an array")
    void createAndInitializeArray() {
        String[] result = new Exercise01().createAndInitializeArray();

        assertNotNull(result, "The method returned 'null'.");
        assertEquals(3, result.length, "The array that the method returned was the wrong length.");
        assertArrayEquals(new String[]{"one", "two", "three"}, result, "The array that the method returned did not contain the expected elements.");
    }
}
