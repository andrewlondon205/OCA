package com.pluralsight.oracle.oca.selectedclasses.strings;

import static java.lang.System.out;
public class StringBuilder2 {

    public static void main(String[] args) {

        out.println("\n** Using StringBuilder, Part 2 ** \n");

        StringBuilder sb1 = new StringBuilder("Hello");

        sb1.append(" ").append("there");
        out.println(sb1);

        StringBuilder sb2 = new StringBuilder(" World!");
        sb1.append(sb2);
        out.println(sb1);

        StringBuilder sb3 = new StringBuilder();
        sb3.append(3.1)
                .append(4)
                .append(" is PI = ")
                .append(true);

        out.println(sb3);

        int index = sb3.indexOf(".");
        out.println(index);

        Character chr = sb3.charAt(index);
        out.println(chr);

        sb1 = new StringBuilder("Hi There!");
        sb1.replace(2,3,"-*-");
        out.println(sb1);

        sb1.deleteCharAt(3);
        out.println(sb1);

        sb1.delete(2,4);
        out.println(sb1); //HiThere!

        sb1.insert(2," ");
        out.println(sb1);

        String str1 = sb1.substring(0,2);
        out.println(str1); //
    }
}
