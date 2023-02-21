package com.pluralsight.oracle.oca.arrays.multidimensional;

public class LoopOverMultiArrays {

    public static void main(String[] args) {

        float[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};


        //TRADITIONAL FOR LOOP

        for (int i=0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //ENHANCED FOR LOOP

        for (float [] row : matrix ) {
            for(float element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}