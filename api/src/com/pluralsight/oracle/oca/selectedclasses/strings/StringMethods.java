package com.pluralsight.oracle.oca.selectedclasses.strings;

import java.util.Locale;

import static java.lang.System.out;
public class StringMethods {

    public static void main(String[] args) {

        out.println("\n** String Methods, Part 1 ** \n");

        String str = new String("Hello World");
        String str2 = new String("Hello World");
        out.println(str = str2); //false

        str.equals(str2); // true

        String str3 = "hello World";
        str.equals(str3); // false
        str.equalsIgnoreCase(str3);

        str = "Hello World!";
        str.length(); //12

        str = "\tHello \"Cruel\" World!\n";
        str.length(); // 22

        str = "Hello World";
        str2 = str.toUpperCase(); // "HELLO WORLD"
        str3 = str.toLowerCase(); // "hello world"

        out.println(str == str2 || str == str3 || str2 == str3);
        str = "Love For All, Hatred For None"; //true
        str.startsWith("Lov");
        str.startsWith("luv");

        str.endsWith("one"); // true
        str.endsWith("Non"); // false

        str2 = "Hello, my name is Richard";
        str.contains("Rich"); // true
        str.contains("Rick"); // false

        str = " Hi there! ";
        str2 = str.trim();
        str2.length(); // 9, ("Hi there!"   )

        str = "\t\b   \"Hi there!\"   \\\r\n\f";
        str.length(); //22

    }
}
