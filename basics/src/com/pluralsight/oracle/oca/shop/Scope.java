package com.pluralsight.oracle.oca.shop;

public class Scope {

    public void randomMethod () {
        System.out.println(x);
    }

    public int x = 87;


    public static void main(String[] args) {

        int x = 7;
        if(x < 4) {
            System.out.println(x);
            int y = 8;
            System.out.println(y);
            if(y < 10) {
                System.out.println(x + y);
            }


        }
    }
}
