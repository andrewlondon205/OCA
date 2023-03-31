package exceptions;

import java.io.FileNotFoundException;

public class Zoo {

    public static int indexOf(String [] names,String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    static void fall () throws Exception {
        throw new Exception();
    }


    public static void main(String[] args) throws Exception {

/*
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[3]);
        System.out.println(indexOf(new String [] {"Erica Vaccari","Livia Ramos", "Martina Caradonna"},"Martina Caradonna"));
        System.out.println(indexOf(new String [] {"Erica Vaccari","Livia Ramos", "Martina Caradonna"},"Giulia Cipriani"));
        System.out.println(indexOf(new String [] {"Erica Vaccari","Livia Ramos", "Martina Caradonna"},"Livia Ramos"));
        System.out.println(indexOf(new String [] {"Erica Vaccari","Livia Ramos", "Martina Caradonna"},"Erica Vaccari"));*/
        // fall();

    try {
         int a = 10/0;
    } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
    }

    System.out.println("LOL");
    }
}
