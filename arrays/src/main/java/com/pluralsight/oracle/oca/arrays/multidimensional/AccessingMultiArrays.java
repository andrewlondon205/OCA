package com.pluralsight.oracle.oca.arrays.multidimensional;

public class AccessingMultiArrays {
    public static void main(String[] args) {

        float [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Element [1][2] is: " + matrix[1][2]);

        float[] secondRow = matrix[1];
        float element = secondRow[2];

        float [][] triangle = {{3},{6,7},{9,5,1,3},{0,4,6,5,8}};
        //float value = triangle[0][1]

        String [][] text  = {{"Hello","World"},{},null};
        String s1 = text[1][0]; // ArrayIndexOutOfBoundsException, text[1] has 0 elements
        String s2 = text[2][0]; // NullPointerException, text[2] is null

    }
}
