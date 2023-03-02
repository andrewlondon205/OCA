package com.pluralsight.oracle.oca.selectedclasses.strings;

import static java.lang.System.out;

public class StringBuilder1 {


    public static void main(String[] args) {

        out.println("\n** Using StringBuilder, Part 1 ** \n");

        /*String Method Calls*/

        String str1 = new String("Xello");
        out.println(str1);
        String str2 = str1.replace('X','H');
        out.println(str2); // "Hello"
        out.println(str1 == str2); // false

        StringBuilder sb = new StringBuilder("Xello");
        out.println(sb);

        StringBuilder sb2 = sb.replace(0,1,"H");
        out.println(sb2);
        out.println(sb);
        out.println(sb == sb2);

        sb = new StringBuilder();
        out.println(sb.length());
        out.println(sb.capacity());

        sb = new StringBuilder(100);
        out.println(sb.length());
        out.println(sb.capacity());

        sb = new StringBuilder("Hello");
        out.println(sb.length());
        out.println(sb.capacity());



    }
}
