package com.pluralsight.oracle.oca.selectedclasses.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.lang.System.out;
public class CreateDateTime2 {

    public static void main(String[] args) {

        out.println("\n** Dates and Times, Part 2 ** \n");

        /* Create a LocalDate */

        LocalDate date = LocalDate.of(2023,03,02);
        out.println("1. " + date);

        LocalDate tempDate = date.plusYears(3);
        out.println("2. " + tempDate);

        LocalTime time = LocalTime.of(9,00);
        out.println("3. " + time);

        LocalTime tempTime = time.plusSeconds(3);
        out.println("4. " + tempTime);

        out.println("5. " + date);
        tempDate = date.minusDays(3);
        out.println("6. " + tempDate);

        out.println("7. " + time);
        tempTime = time.minusSeconds(30);
        out.println("8. " + tempTime);

        LocalDateTime dateTime = LocalDateTime.of(date,time);
        out.println("12. " + dateTime);

        LocalDateTime tempDateTime =
                dateTime.plusDays(3)
                        .plusMonths(2)
                        .plusHours(4);

        out.println("13. " + tempDateTime);

        LocalDate date1 = LocalDate.of(2023,03,02);
        LocalDate date2 = LocalDate.of(2023,03,02);

        out.println("14. " + date1.equals(date2));

        date2 = date2.plusDays(3);
        out.println("15. " + date2.isAfter(date1));
        out.println("16. " + date2.isBefore(date1));

        date1 = LocalDate.now();
     //   date2 = date1.minusHours(3) // will not compile
    }


}
