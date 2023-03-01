package com.pluralsight.oracle.oca.selectedclasses.strings;

import static java.lang.System.out;
public class ImmutableString {

    public static void main(String[] args) {

        out.println("\n** Immutable Strings ** \n");
        java.lang.String str = "Hello!";

        String str2= "Hello!";
        out.println(str == str2); // true

        String str3 = new String("Hello!");
        out.println(str == str3); //false

        String str4 = str.substring(5);
        String str5 = str.substring(5);
        out.println(str4 == str5); //false




    }
}
