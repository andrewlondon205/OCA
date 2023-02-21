package com.pluralsight.oracle.oca.arrays;

import java.time.LocalDate;

public class VariableArguments {

    public static void main(String[] args) {

        String text = String.format("Hello %s, today is %s","World", LocalDate.now().getDayOfWeek());
        System.out.println(text);

        int [] numbers = {2,5,6,7,8};
        int result = sum(numbers);
        System.out.println(result);
    }

    public static int sum(int ... numbers) {
        int sum = 0;
        for (int number : numbers)
            sum += number;
        return sum;
    }


}
