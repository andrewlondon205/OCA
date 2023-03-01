package com.pluralsight.oracle.oca.selectedclasses.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class InspectingTraversingArrayLists {

    public static void main(String[] args) {

        System.out.println("\n** Inspecting and Traversing ArrayLists ** \n");

        String [] array_1 = {"red","green","blue"};
        ArrayList<String> aList_1 = new ArrayList<>(Arrays.asList(array_1));
        System.out.println("1. aList_1 = " + aList_1.toString());

        boolean flag = aList_1.contains("red");
        System.out.println("2. aList_1 contains \"red\"? " + flag );

        String [] array_2 = {"green","blue","red"};
        ArrayList<String> aList_2 = new ArrayList<>(Arrays.asList(array_2));
        System.out.println("4. aList_2 = " + aList_2.toString());

        flag = aList_1.equals(aList_2);
        System.out.println("5. aList_1.equals(aList_2)? " + flag);

        String [] array_3 = {"red","green","blue"};
        ArrayList<String> aList_3 = new ArrayList<>(Arrays.asList(array_3));
        System.out.println("6. aList_3 = " + aList_3.toString());

        flag = aList_1.equals(aList_3);
        System.out.println("7. aList_1.equals(alist_3)? " + flag);

        aList_3.add("purple");
        System.out.println("8. aList_3 = " + aList_3.toString());

        flag = aList_1.equals(aList_3);
        System.out.println("9. aList_1.equals(aList_3)? " + flag);

        System.out.println("10. aList_1 with for loop:");
        for (String color : aList_1)
            System.out.println(" - " + color);

        ListIterator<String> iterator = aList_1.listIterator();
        System.out.println("11. aList_1 with while loop");
        while (iterator.hasNext()) {
            System.out.println(" - " + iterator.next());
        }

        System.out.println("12. aList_2 with forEach");
        aList_2.forEach(name -> System.out.println(" - " + name ));

        aList_2.sort(null);
        System.out.println("13. aList_2.sort(null)");
        aList_2.forEach(name -> System.out.println(" - " + name));

    }
}
