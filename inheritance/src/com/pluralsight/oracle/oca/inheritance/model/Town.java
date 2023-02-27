package com.pluralsight.oracle.oca.inheritance.model;

public class Town {

    private final String name;
    private int population;

    public Town (String name) {
        this(name,0);
    }

    public Town (String name, int population ) {
        this.name = name;
        this.population = population;
    }

    public String getName () {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

