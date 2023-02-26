package com.pluralsight.oracle.oca.encapsulation.flightplan;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        FlightPlan berlinToBucharest = new FlightPlan("BER","OPT");

        berlinToBucharest.print();

        FlightPlan londonToParis = new FlightPlan(
                "LHR",
                "CDG",
                LocalDateTime.of(2021,11,10,22,10),
                Arrays.asList("LHR","FARAR","BAYKA","DUDES","CDG"));

        System.out.println();
    }
}
