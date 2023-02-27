package com.pluralsight.oracle.oca.inheritance.superconstructor;

public class City {

    private String name;
    private Integer population;

    public City (String name, Integer population) {
        super();
        this.name = name;
        this.population = population;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }
}
