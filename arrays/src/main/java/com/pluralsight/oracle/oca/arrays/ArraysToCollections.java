package com.pluralsight.oracle.oca.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToCollections {

    public static void main(String[] args) {

        String [] array = {"one","two","three"};
        List<String> list = Arrays.asList(array);

        List<String> list2 = Arrays.asList("hello","this","is","my","world");

        list.set(0,"four");
        System.out.println(Arrays.toString(array));

        array[0] = "five";
        System.out.println(list);

     //   list.add("six");

        List<String> list3 = new ArrayList<>(Arrays.asList(array));
        list3.add("six");
        System.out.println(list3);
        System.out.println(Arrays.toString(array));
    }
}
