package com.pluralsight.oracle.oca.selectedclasses.strings;

import static java.lang.System.out;
public class StringMethods {

    public static void main(String[] args) {

        out.println("\n** String Methods, Part 1 ** \n");

        String str = new String("Hello World");
        String str2 = new String("Hello World");
        out.println(str = str2); //false

        str.equals(str2);
    }
}
