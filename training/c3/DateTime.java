package c3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {

    public static void main(String[] args) {
      //  workingwithDates();
        //manipulatingDatesTimes();
    }

    public static void workingwithDates () {

        /**
         * import java.time.*; // import time classes
         *
         * LocalDate: Contains just a current date—no time and no time zone. Example: 1996/09/04
         * LocalTime: Contains just a current time—no date and no time zone. Example: 23:12:34
         * LocalDateTime: Contains both a current date and time but no time zone. Example 2023-04-21T14:39
         */

        System.out.println(LocalDate.now()); // 2023-04-21
        System.out.println(LocalTime.now()); // 14:39:51.874810
        System.out.println(LocalDateTime.now()); // 2023-04-21T14:42:38.913103

        /**
         * CREATING DATES
         *
         * Method Signatures:
         *
         * - public static LocalDate of(int year, int month, int dayOfMonth)
         * - public static LocalDate of(int year, Month month, int dayOfMonth)
         */

        LocalDate date1 = LocalDate.of(2021, Month.DECEMBER,28);
        LocalDate date2 = LocalDate.of(2021,12,28);

        // Month is a special type of class called an enum. You don’t need to know about enums on the OCA exam and can just treat them as constants.

        /**
         * CREATING TIMES
         *
         * - When creating a time, you can choose how detailed you want to be. You can specify just the hour and minute,
         *   or you can add the number of seconds.
         * - You can even add nanoseconds if you want to be very precise.
         *
         * Method Signatures:
         *
         * - public static LocalTime of(int hour, int minute)
         * - public static LocalTime of(int hour, int minute, int second)
         * - public static LocalTime of(int hour, int minute, int second, int nanos)
         */

        LocalTime time1 = LocalTime.of(23,12);
        LocalTime time2 = LocalTime.of(23,12,34);
        LocalTime time3 = LocalTime.of(23,12,34,42);

        // It is also possible to combine dates and times
        LocalDateTime dateTime1 = LocalDateTime.of(2021,Month.DECEMBER,28,3,40,41);
        LocalDateTime dateTime2 = LocalDateTime.of(date1,time1);

        /**
         * DateTime signatures:
         *
         * public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
         * public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
         * public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)
         * public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
         * public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
         * public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)
         * public static LocalDateTime of(LocalDate date, LocalTime)
         *
         * Note: LocalDate, LocalTime, LocalDateTime have private constructors meaning that we can't instantiate them using new keyword.
         */

        //LocalDate d = new LocalDate(); does not compile
        //LocalDate.of(2015,Month.DECEMBER,32); //throws exception
    }

    public static void manipulatingDatesTimes () {

        /**
         * The date and time classes are immutable, just like String. This means that we need to remember to assign the
         * results of these methods to a reference variable so they are not lost.
         */

        LocalDate date = LocalDate.now();

        System.out.println(date);
        date = date.plusDays(2);
        System.out.println(date);
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);

        LocalDate alpha_date = LocalDate.of(2037,Month.AUGUST,25);
        LocalTime alpha_time = LocalTime.of(18,42);

        LocalDateTime dateTime = LocalDateTime.of(alpha_date,alpha_time);
        System.out.println(dateTime);

        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2037-08-24T18:42
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2037-08-24T08:42
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2037-08-24T08:41:30

        // It is common for date and time methods to be chained.
        LocalDate aDate = LocalDate.of(2023,06,28);
        LocalTime aTime = LocalTime.of(19,15,00);

        LocalDateTime dt = LocalDateTime.of(aDate,aTime).minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dt);

        //When you have a lot of manipulations to make, this chaining comes in handy. There are two ways the exam creators can try to trick you.
        LocalDate myDate = LocalDate.of(2020,Month.JANUARY,20);
        myDate.plusDays(10);
        System.out.println(myDate);

        //Whenever you see immutable types, pay attention to make sure the return value of a method call isn’t ignored.
        //The exam also may test to see if you remember what each of the date and time objects includes. Do you see what is wrong here?
        LocalDate newDate = LocalDate.of(2020,Month.JANUARY,20);
       // newDate = newDate.plusMinutes(1); does not compile

        /**
         *  LocalDate does not contain time. This means you cannot add minutes to it.This can be tricky in a chained
         *  sequence of additions/subtraction operations, so make sure you know which methods can be called on which
         *  of the following objects.
         *
         *  Method                          Can call on LocalDate?         Can call on LocalTime?       Can call on LocalDateTime?
         *  plusYears/minusYears                    Yes                             No                              Yes
         *  plusMonths/minusMonths                  Yes                             No                              Yes
         *  plusWeeks/minusWeeks                    Yes                             No                              Yes
         *  plusDays/minusDays                      Yes                             No                              Yes
         *  plusHours/minusHours                    No                              Yes                             Yes
         *  plusMinutes/minusMinutes                No                              Yes                             Yes
         *  plusSeconds/minusSeconds                No                              Yes                             Yes
         *  plusNanos/minusNanos                    No                              Yes                             Yes
         *
         */
    }

}

class Periods {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
     //   performAnimalEnrichment(start, end, period);
    //    periods();
        formatting();
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // add a month
            }
    }

    public static void periods () {
        Period annually = Period.ofYears(1);
        Period quarterly = Period.ofMonths(3);
        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyYearAndAWeek = Period.of(1,0,7);

        System.out.println("1 year: " + annually); //P1Y
        System.out.println("3 months: " + quarterly); // P3M
        System.out.println("3 weeks: "+everyThreeWeeks); // P21D
        System.out.println("2 days: " + everyOtherDay); // P2D
        System.out.println("1 year and 7 days: " + everyYearAndAWeek); // P1Y7D

        // Chaining methods is not supported when creating periods. Only the last method is used because Periods methods are static

        LocalDate date = LocalDate.of(2021,12,28);
        LocalTime time = LocalTime.of(6,15);
        LocalDateTime dateTime = LocalDateTime.of(date,time);

        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period));
        System.out.println(dateTime.plus(period));
        System.out.println(time.plus(period)); //throws exception
    }

    public static void formatting () {
       // The date and time classes support many methods to get data out of them:
        LocalDate date = LocalDate.of(2023,Month.APRIL,21);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());

        LocalDate alphaDate = LocalDate.of(1999,Month.NOVEMBER,19);
        LocalTime alphaTime = LocalTime.of(11,12,34);
        LocalDateTime dateTime = LocalDateTime.of(alphaDate,alphaTime);

        System.out.println(alphaDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(alphaTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // This is a reasonable way for computers to communicate, but probably not how you want to output the date and time in your program.
        // Luckily there are some predefined formats that are more useful:

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(alphaDate));

        DateTimeFormatter fdatetime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(fdatetime));
        System.out.println(alphaDate.format(fdatetime));
        // System.out.println(alphaTime.format(fdatetime));

        LocalDate d1 = LocalDate.of(2023,Month.APRIL,21);
        LocalTime t1 = LocalTime.of(23,30,15);
        LocalDateTime dt = LocalDateTime.of(d1,t1);

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dt)); // 4/21/23, 11:30 PM
        System.out.println(mediumF.format(dt)); // Apr 21, 2023, 11:30:15 PM

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dt.format(f));

        DateTimeFormatter f1 =  DateTimeFormatter.ofPattern("yyyy-MM-dd | hh:mm:ss");
        System.out.println(dt.format(f1));

        LocalDate ramBirthDate = LocalDate.of(1996,Month.SEPTEMBER,4);
        LocalTime ramBirthTime = LocalTime.of(23,12,34);
        LocalDateTime ramDetails = LocalDateTime.of(ramBirthDate,ramBirthTime);

        System.out.println(ramDetails.format(f1));

        /**
         * PARSING
         * from string to date or time
         */

        DateTimeFormatter ft = DateTimeFormatter.ofPattern("MM dd yyy");
        LocalDate aDate = LocalDate.parse("2021-12-28"); // will throw an exception if we provide an invalid format date
        System.out.println(aDate);
    }


}
