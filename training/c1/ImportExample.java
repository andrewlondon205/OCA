package c1;


import java.util.Random; // import tells us where to find Random
import java.lang.System; // Redundant import
import java.lang.*; //Redundant import
import java.util.*; //Redundant import


public class ImportExample {

    public static void main(String[] args) {

        //Note: if we omit the import of the class Random from java.util.Random, java will throw a compiler error
        Random r = new Random();

        System.out.println(r.nextInt(10)); // prints a number between 0 and 9
        System.out.println(r.nextInt(50)); // prints a number between 0 and 49
        System.out.println(r.nextDouble(20.1)); // prints a number between 0 and 20

    }
}


