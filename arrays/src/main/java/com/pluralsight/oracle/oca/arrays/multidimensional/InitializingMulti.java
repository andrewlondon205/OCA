package com.pluralsight.oracle.oca.arrays.multidimensional;

public class InitializingMulti {

    public static void main(String[] args) {

        float [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        //Three-dimensional array
        float [][][] values = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};

        float [][] triangle = {{3},{6,7},{2,4,8},{9,5,1,3},{0,4,6,5,8}};

        String [][] text = {{"Hello","World"},{},null};

        float [][] matrix2 = new float[3][3];
        float [][] matrix3 = {{0,0,0},{0,0,0},{0,0,0}};

        float [][] matrix4 = new float[3][];
        float [][] matrix5 = {null, null, null};

    }
}
