package com.pluralsight.oracle.oca.arrays.exercises;

public class Exercise05 {

    public int countZeroes(int[] arg) {
        // TODO: Count how many elements of the array have the value 0 and return that number.
        //       Use an enhanced for-loop to iterate over the array (don't iterate over the indices).

        int counter = 0;
        for (int element : arg) {
            if (element == 0 )
                counter++;
        }

        return counter;
    }
}
