package com.pluralsight.oracle.oca.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToSet {

    public static void main(String[] args) {

        String [] array = {"one","two","three","four","four"};

        Set<String> set = new TreeSet<>(Arrays.asList(array));

        System.out.println(set);

        String [] arrays = set.toArray(new String[0]);

    }
}
