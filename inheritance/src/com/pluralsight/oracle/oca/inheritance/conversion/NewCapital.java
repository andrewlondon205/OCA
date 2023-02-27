package com.pluralsight.oracle.oca.inheritance.conversion;

import com.pluralsight.oracle.oca.inheritance.CapitalCity;

public class NewCapital extends CapitalCity implements Comparable<NewCapital> {

    @Override
    public int compareTo(NewCapital o) {
        return this.getName().compareTo(o.getName());
    }
}
