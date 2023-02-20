package com.pluralsight.oracle.oca.arrays.exercises;

public class Exercise03 {

    // This method receives two arrays of int as arguments (a and b). These two arrays have the same length.
    public int[] sumElementByElement(int[] a, int[] b) {
        // TODO: Step 1 - Declare and initialize new array of int named c that has the same length as a.
        int [] c = new int[a.length];
        // TODO: Step 2 - Write a for-loop with a loop counter i that goes over all valid indices of array c.
        for (int i = 0 ; i < c.length ; i++ ) {
            // TODO: Step 3 - Inside the for-loop, add the i'th element of arrays a and b and assign it to the i'th element of array c.
            c[i] = a[i] + b[i];
        }
        // TODO: Step 4 - Return array c here; replace 'null' by c.
        return c;
    }
}
