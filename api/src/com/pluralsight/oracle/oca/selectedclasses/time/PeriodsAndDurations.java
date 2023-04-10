package com.pluralsight.oracle.oca.selectedclasses.time;

import java.time.*;

import static java.lang.System.out;

public class PeriodsAndDurations {

     public static void main(String[] args) {

        out.println("\n** Periods and Durations ** \n");

        LocalDate nowDate = LocalDate.now();
        LocalDate laterDate = nowDate.plusDays(2);

        Period period = Period.between(nowDate,laterDate);
        out.println("1. " + period.getDays());

        LocalTime nowTime = LocalTime.now();
        LocalTime laterTime = nowTime.plusHours(3);

        Duration duration = Duration.between(nowTime,laterTime);
        out.println("2. " + duration.getSeconds());
        out.println("3. " + duration.getSeconds()/3600);

        period = Period.ofDays(3);
        duration = Duration.ofHours(2);

        LocalDateTime dateTime = LocalDateTime.of(2023,03,02,14,50);
        out.println("4. " + dateTime);
        
        LocalDateTime later = dateTime.plus(period).plus(duration);
        out.println("5. " + later);

        period = Period.of(2,3,5);
        out.println("6. " + period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days");

        period = Period.ofMonths(2);

        String [] arguments = {"1","2"};

        

    }

}

