package com.pluralsight.oracle.oca.arrays.multidimensional;

public class LoopOverMultiArrays {

    public static void main(String[] args) {

        float[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0; i < 3; i ++) {
            for (int j = 0; j < 3 ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}