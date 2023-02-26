package com.pluralsight.oracle.oca.inheritance;

public class City {
    private final String name;
    private Integer population;

    public City (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        if (population < 0 )
            throw new IllegalArgumentException("Population cannot be negative");
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}

