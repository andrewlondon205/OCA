package com.pluralsight.oracle.oca.selectedclasses.strings;

import static java.lang.System.out;

public class StringMethods2 {

    public static void main(String[] args) {

        out.println("\n** String Method Chaining ** \n");

        String str = "Hello World!";
        Character chr = str.charAt(1);
        out.println(chr);

        str = "Mississippi";
        int index = str.indexOf('s');
        out.println(index); // 2

        index = str.indexOf("is");
        out.println(index); // 1

        index = str.indexOf('i',5); // 7
        index = str.indexOf("ss",4); // 5

        str = "Mississippi";
        String subStr = str.substring(8);
        subStr = str.substring(5,8); // (ssi)

        str = "MISSISSIPPI";
        String str2 = str.replace('I','X');
        out.println(str2);

        str2 = str.replace("SS","xx");
        out.println(str2);

        String str3 = str2.replace("xx","ss")
                .toLowerCase()
                .replace('m','M');

        out.println(str3);



    }
}
