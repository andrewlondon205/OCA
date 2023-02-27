package com.pluralsight.oracle.oca.inheritance;

public class DriverCode {

    public static void main(String[] args) {

        City newYork = new City();
        newYork.setName("New York");
        newYork.setPopulation(10);

        CapitalCity paris = new CapitalCity();
        paris.setName("Paris");
        paris.setPopulation(20);

        System.out.println("Paris = " + paris.toString());
        System.out.println("New York = " + newYork.toString());

        process(paris);


    }

    static void process(City city) {
        System.out.println("City = " + city.toString());
    }

}
