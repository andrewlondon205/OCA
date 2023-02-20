package com.pluralsight.oracle.oca.arrays.exercises;

public class Exercise04 {

    // This method receives an array of char. It should return a new array with the elements in reverse order.
    public char[] reverseArray(char[] arg) {
        // TODO: Step 1 - Declare and initialize an array of char of the same length as 'arg'.
        char [] elements = new char[arg.length];
        // TODO: Step 2 - Write a for-loop to initialize the elements of your array with the elements of 'arg',
        //                but in reverse order.
        int index = 0;
        for (int k = arg.length-1 ; k >= 0 ; k --) {
            // TODO: Step 3 - Return your array here; replace 'null' by the name of your array variable.
            elements[index] = arg[k];
            index++;
        }
        return elements;
    }

}
