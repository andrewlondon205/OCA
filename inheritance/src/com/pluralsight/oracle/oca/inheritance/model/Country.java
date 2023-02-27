package com.pluralsight.oracle.oca.inheritance.model;

import java.util.ArrayList;
import java.util.List;

public class Country {

    List<Town> towns;

    public List<String> getTownName() {
        List<String> names = new ArrayList<>();
        for (Town town : towns)
            names.add(town.name);
        return names;
    }
}
