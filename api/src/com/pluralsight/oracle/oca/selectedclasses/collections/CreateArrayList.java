package com.pluralsight.oracle.oca.selectedclasses.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CreateArrayList {

    public static void main(String[] args) {

        System.out.println("\n** Create ArrayList ** \n");

        ArrayList aList = new ArrayList();

        ArrayList aList_2 = new ArrayList(10);

        ArrayList<String> aList_3 = new ArrayList<String>();

        ArrayList<String> aList_4 = new ArrayList<>();

        List list_1  = new ArrayList();

        // aList = new List<>(); // will not compile

        String [] array = {"red","green","blue"};

        list_1 = Arrays.asList(array);
        System.out.println("3. list_1 = " + list_1.toString());

        aList_2 = new ArrayList(list_1);
        System.out.println("4. aList_2 = " + aList_2.toString());

        aList_3 = new ArrayList<>(Arrays.asList(array));
        System.out.println("5. aList_3 = " + aList_3.toString());



    }
}
