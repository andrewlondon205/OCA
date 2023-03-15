package com.pluralsight.oracle.oca.selectedclasses.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingRemovingElements {

    public static void main(String[] args) {

        System.out.println("\n** Adding and Removing Elements ** \n");

        String [] array_1 = {"red","green","blue"};
        ArrayList<String> aList_1 = new ArrayList<>(Arrays.asList(array_1));
        System.out.println("1. aList_1 = " + aList_1.toString());

        aList_1.add("purple");
        System.out.println("2. aList_1 = " + aList_1.toString());

        aList_1.add(0,"orange");
        System.out.println("3. aList_1 = " + aList_1.toString());

        String [] array_2 = {"black","white","blue"};
        List<String> list_1 = new ArrayList<>(Arrays.asList(array_2));
        System.out.println("4. aList_1 = " + aList_1.toString());

        aList_1.addAll(0,list_1);
        System.out.println("5. aList_1 = " + aList_1.toString());

        String item = aList_1.get(1);
        System.out.println("6. aList_1[1] = " + item);
        System.out.println("7. aList_1 = " + aList_1.toString());

        aList_1.set(1,"yellow");
        System.out.println("8. aList_1 = " + aList_1.toString());

        aList_1.remove("blue");
        System.out.println("9. aList_1 = " + aList_1.toString());

        aList_1.remove(2);
        System.out.println("10. aList_1 = " + aList_1.toString());

        String [] array_3 = {"yellow","red","purple"};
        ArrayList<String> aList_2 = new ArrayList<>(Arrays.asList(array_3));
        System.out.println("11. aList_2 = " + aList_2);
        boolean flag = aList_1.removeAll(aList_2);
        System.out.println("12. aList_1.removeAll() = " + flag);
        System.out.println("13. aList_1 = " + aList_1);

        int size = aList_1.size();
        System.out.println("14. aList_1.size() = " + size);

        aList_1.clear();
        System.out.println("15. aList_1 = " + aList_1.toString());

        boolean isEmpty = aList_1.isEmpty();
        System.out.println("16. aList_1.isEmpty() = " + isEmpty);
    }
}
