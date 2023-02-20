package com.pluralsight.oracle.oca.arrays.multidimensional;

public class MultiArray {

    public static void main(String[] args) {

        float [][] matrix = new float [3][3];

        float [][] matrix2 = new float[3][];

        for(int i = 0 ; i < matrix2.length ; i++) matrix2[i] = new float[3];

        float [][] triangle = new float[10][];

        for (int i = 0; i < triangle.length; i ++) {
            triangle[i] = new float[i+ 1];
        }

        String [][][][] data = new String[3][2][][];

        int [] b [] ;

    }
}
