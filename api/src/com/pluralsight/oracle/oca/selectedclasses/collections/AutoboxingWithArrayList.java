package com.pluralsight.oracle.oca.selectedclasses.collections;

import java.util.ArrayList;

import static java.lang.System.out;
public class AutoboxingWithArrayList {

    public static void main(String[] args) {


        out.println("\n** Autoboxing With ArrayList ** \n");

        ArrayList<Integer> aList_1 = new ArrayList<>();
        Integer number = new Integer(3);
        aList_1.add(number);
        out.println("1. aList_1 = " + aList_1.toString());

        aList_1.add(7);
        out.println("2. aList_1 = " + aList_1.toString());

        aList_1.set(1,9);
        out.println("3. aList_1 = " + aList_1.toString());

        int intNum = aList_1.get(1);
        out.println("4. aList_1[1] = " + intNum);

        Integer intgr = aList_1.get(0);
        out.println("5. aList_1[0] = " + intgr);


    }
}
