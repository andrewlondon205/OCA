package com.pluralsight.oracle.oca.arrays.exercises;

public class Exercise02 {

    public int getFirstElement(int[] arg) {
        // TODO: Return the first element of the array 'arg'.
        // Note: Beware that an array can have zero elements. If the array has zero elements, return the value -1.
        return arg.length > 0 ? arg[0] : -1;
    }

    public int getLastElement(int[] arg) {
        // TODO: Return the last element of the array 'arg'.
        // Note: Beware that an array can have zero elements. If the array has zero elements, return the value -1.
        return arg.length > 0? arg[arg.length-1] : -1 ;
    }
}
