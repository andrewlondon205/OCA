package com.pluralsight.oracle.oca.arrays;

import java.util.Scanner;

/**
 * Entering multiple numbers and computing the sum using an array
 */
public class InteractiveArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int count = Integer.parseInt(scanner.nextLine());

        int [] numbers = new int[count];
        int sum = 0;
        for(int i=0 ; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
            sum += numbers[i];
        }

        System.out.println("The sum is " + sum);

    }
}
