package com.pluralsight.oracle.oca.arrays;

public class AccessingArrays {

    public static void main(String[] args) {

        String [] names = new String[4];

        names[0] = "Susan";
        names[1] = "John";
        names[2] = "Betty";
        names[3] = "Mark";

        System.out.println("The first name is " + names[0]);
        System.out.println("The second name is " + names[1]);
        System.out.println("The third name is " + names[2]);
        System.out.println("The fourth name is " + names[3]);

        int index = 2;
        String name = names[index]; //invalid index
        System.out.println("the name at index " + index + " is: " + name);

    }
}
