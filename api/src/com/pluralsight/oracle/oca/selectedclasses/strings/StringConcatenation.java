package com.pluralsight.oracle.oca.selectedclasses.strings;

import static java.lang.System.out;
public class StringConcatenation {

    public static void main(String[] args) {

        out.println("\n** String concatenation ** \n");

        String str = "Hi, ";
        String str2 = str + "Bob!";
        out.println(str2);

        String pi = "3.14" + 15926;
        out.println(pi); //3.1415926

        String str3 = 5 + 3 + "xyz" + 3 + 5; // 8xyz35 result
        out.println(str3);

        String str4 = "Pi is ";
        str4 += "3.14";
        out.println(str4);

        str4 += "__" + 5 * 4;
        out.println(str4);

    }
}
