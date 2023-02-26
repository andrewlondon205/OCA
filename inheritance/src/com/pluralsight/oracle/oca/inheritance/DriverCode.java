package com.pluralsight.oracle.oca.inheritance;

public class DriverCode {

    public static void main(String[] args) {

        City city = new City("Paris");
        city.setPopulation(10);

        System.out.println("Name = " + city.getName());
        System.out.println("Population = " + city.getPopulation());
    }
}
