package com.pluralsight.oracle.oca.selectedclasses.collections;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.*;
public class LambdaFunctionalInterfaces {

    public static void main(String[] args) {

        out.println("\n** Lambdas and Functional Interfaces ** \n");

        class InnConsumer <String> implements Consumer<String> {
            @Override
            public void accept (String string) {
                out.println(" - " + string);
            }
        }

        InnConsumer innConsumer = new InnConsumer<String>();

        String [] array_1 = {"red","green","blue"};
        ArrayList<String> aList_1 = new ArrayList<>(Arrays.asList(array_1));

        out.println("1. forEach using Inner Class");
        aList_1.forEach(innConsumer);

        Consumer<String> anonConsumer = new Consumer<String>() {
            @Override
            public void accept(String string) {
                out.println(" - " + string);
            }
        };

        out.println("2. forEach using Anonymous Class");
        aList_1.forEach(anonConsumer);

        //Consumer<String> lambdaConsumer = (String string ) -> {out.println(" - " + string);};
        //Consumer<String> lambdaConsumer = string  -> {out.println(" - " + string);};
        Consumer<String> lambdaConsumer = string -> out.println(" - " + string);

        out.println("3. forEach using reference to Lambda Expression Reference");
        aList_1.forEach(lambdaConsumer);

        out.println("4. forEach using reference to Lambda Expression In-Line");
        aList_1.forEach(string -> out.println(" - " + string));

        aList_1.sort((str1,str2) -> str1.compareTo(str2));
        out.println("5. sort using Lambda Expression InLine");
        aList_1.forEach(string -> out.println(" - " + string));



    }
}
