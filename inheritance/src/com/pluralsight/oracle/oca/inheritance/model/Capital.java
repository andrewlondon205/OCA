package com.pluralsight.oracle.oca.inheritance.model;

public class Capital extends Town{

    public Capital(String name) {
        super(name);
    }

    public Capital(String name, int population) {
        super(name, population);
    }

}
