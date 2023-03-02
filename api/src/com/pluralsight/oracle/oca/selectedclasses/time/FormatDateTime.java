package com.pluralsight.oracle.oca.selectedclasses.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.System.out;

public class FormatDateTime {

    public static void main(String[] args) {

        out.println("\n** Dates and Times, Part 2 ** \n");

        //Monday, October 31, 2022 at 09:45

        LocalDateTime localDateTime = LocalDateTime.of(2023,03,02,15,01);

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("EEEE, LLLL dd, yyyy 'at' hh:mm");

        String dateTimeString = localDateTime.format(pattern);

        out.println(dateTimeString);

    }
}
