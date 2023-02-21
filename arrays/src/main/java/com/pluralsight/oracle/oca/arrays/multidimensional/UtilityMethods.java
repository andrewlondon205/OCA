package com.pluralsight.oracle.oca.arrays.multidimensional;

import java.util.Arrays;

public class UtilityMethods {

    public static void main(String[] args) {

        String [] words = {"Hey", "Whatsapp"};
        System.out.println(Arrays.toString(words));

        String [][] sentences = {{"Hi","There"},{"How","are","you","doing"}};

        System.out.println(Arrays.deepToString(sentences));

        String [][] sentences2 = {{"Hi","There"},{"How","are","you","doing"}};

        System.out.println(Arrays.equals(sentences,sentences2));
        System.out.println(Arrays.deepEquals(sentences,sentences2));
    }
}
