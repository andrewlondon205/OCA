package com.pluralsight.oracle.oca.selectedclasses.time;

import static java.lang.System.out;
import java.time.*;

public class CreateDateTime {

    public static void main(String[] args) {

        out.println("\n** Dates and Times, Part 1 ** \n");

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime  = ZonedDateTime.now();

        localDate = LocalDate.of(2023,03,02);
        out.println(localDate); // 2022-10-31

        localTime = localTime.of(12,33,13);
        out.println(localTime);

        localDateTime = localDateTime.of(2023,03,02,12,33,42);
        out.println(localDateTime);

        zonedDateTime = ZonedDateTime.of(2023,03,02,12,37,21,42,ZoneId.of("America/Chicago"));
        out.println(zonedDateTime);

        LocalDate.of(2023,Month.MARCH,2);

        //LocalDate.of(2023,13,1);
        //LocalDate.of(2023,12,32);
        //LocalDate date = new LocalDate(2023,2,23)



    }
}
