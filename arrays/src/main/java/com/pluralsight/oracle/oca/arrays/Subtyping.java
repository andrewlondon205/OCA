package com.pluralsight.oracle.oca.arrays;

public class Subtyping {

    public static void main(String[] args) {

        String name = "Pluralsight";
        Object lastName = "Vendor";

        String str = (String) lastName;
        System.out.println(str.toUpperCase());

        Object obj = new Object();
        String str2 = (String) obj;


    }
}
