package com.pluralsight.oracle.oca.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsToArrays {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        Object [] array = list.toArray();
   //     String [] strings = (String[]) array;

        String[] array2 = list.toArray(new String[0]);

        list.add("four");
        array2[0] = "five";

        System.out.println(list);
        System.out.println(Arrays.toString(array2));


    }
}
