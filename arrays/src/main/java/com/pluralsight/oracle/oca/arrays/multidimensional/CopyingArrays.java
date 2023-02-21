package com.pluralsight.oracle.oca.arrays.multidimensional;

import java.util.Arrays;

public class CopyingArrays {

    public static void main(String[] args) {
        int [][] numbers1 = {{1,2,3},{4,5}};
        int [][] numbers2 = numbers1.clone(); //shallow copy

        //Using == on objects compares references, not the content of the objects

        System.out.println(numbers1 == numbers2);
        System.out.println(numbers1[0] == numbers2[0]);
        System.out.println(numbers1[1] == numbers2[1]);

        numbers2[0][1] = 7;

        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.deepToString(numbers2));

        //Arrays.copyOf(), copyOfRange and System.arraycopy(): shallow copying

        //Deep copy
        int [][] numbers3 = new int[numbers1.length][];
        for (int i = 0; i < numbers1.length ; i++) {
            numbers3[i] = new int[numbers1[i].length];
            for (int j = 0; j < numbers1[i].length; j++) {
                numbers3[i][j] = numbers1[i][j];
            }
        }

        numbers3[0][1] = 8;
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.deepToString(numbers3));
    }
}
