package com.pluralsight.oracle.oca.selectedclasses.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.lang.System.out;
public class LambdaPredicates {

    public static void main(String[] args) {

        out.println("\n** Lambda Predicates ** \n");

        String [] array_1= {"red","green","blue","orange","purple","yellow"};

        ArrayList<String> aList_1 = new ArrayList<>(Arrays.asList(array_1));
        ArrayList<String> aList_2 = new ArrayList<>(Arrays.asList(array_1));
        ArrayList<String> aList_3 = new ArrayList<>(Arrays.asList(array_1));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String color) {
                return color.endsWith("e");
            }
        };

        out.println("1. removeIf(predicate)");
        aList_1.removeIf(predicate);
        aList_1.forEach(color -> out.println(" - " + color));

        out.println("2. removeIf(color -> color.endsWith(\"e\"))");
        aList_2.removeIf(color -> color.endsWith("e"));
        aList_2.forEach(color -> out.println(" - " + color));

        out.println("3. stream().filter(color -> color.endsWith(\"e\")");
        Stream<String> filtered = aList_3.stream().filter(color -> color.endsWith("e"));
        out.println(Arrays.asList(filtered.toArray()));

    }
}
