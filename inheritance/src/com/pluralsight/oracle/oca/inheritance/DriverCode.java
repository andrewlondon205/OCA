package com.pluralsight.oracle.oca.inheritance;

public class DriverCode {

    public static void main(String[] args) {

        City city = new City();
        city.setName("Paris");
        city.setPopulation(10);

        System.out.println("Name = " + city.getName());
        System.out.println("Population = " + city.getPopulation());

      /*      process(city);

            System.out.println("Name = " + city.getName());
            System.out.println("Population = " + city.getPopulation());*/

        int population = city.getPopulation();
        System.out.println("population = " + population);
        process(population);

        System.out.println("population = " + population);

    }

    static void process(City city) {
        city.setName("New York");
        city.setPopulation(15);
    }

    static void process(int population) {
        population = 100;
    }
}
