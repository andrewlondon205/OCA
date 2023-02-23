package com.pluralsight.oracle.oca.arrays;

import java.lang.reflect.Array;

public class Generics {

    static <T> T[] createArray (Class<T> cls, int size) {
        return (T[]) Array.newInstance(cls,size); // return new Object[size]
    }

    public static void main(String[] args) {
        String [] array = createArray(String.class,3); // ClassCastException
    }


}
