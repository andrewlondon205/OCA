package com.pluralsight.oracle.oca.arrays.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise06 {

    public String[] insertElement(String[] array, String element, int index) {
        String[] result = new String[array.length + 1];

        // TODO: Initialize the array 'result' with the elements of the argument 'array', but with the specified element
        //       inserted at the given index.
        //
        // Don't use loops in your implementation, but use the method System.arraycopy() instead (you'll need to call
        // it two times). Lookup the arraycopy() method in the API documentation of class System:
        // https://docs.oracle.com/javase/8/docs/api/java/lang/System.html

        List<String> numbers = new ArrayList<>(Arrays.asList(array));
        numbers.add(index,element);
        return numbers.toArray(result);
    }

    public static void main(String[] args) {

        Exercise06 e6 = new Exercise06();
        System.out.println(Arrays.toString(e6.insertElement(new String[]{"one","two","three"},"four",2)));
    }
}
