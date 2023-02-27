package com.pluralsight.oracle.oca.inheritance.conversion;

import com.pluralsight.oracle.oca.inheritance.CapitalCity;
import com.pluralsight.oracle.oca.inheritance.City;

public class PlayWithComparables {

    public static void main(String[] args) {

        Comparable<NewCapital> paris = new NewCapital();

        NewCapital london = new NewCapital();
        london.setName("London");

        Comparable<NewCapital> londonComparable = london;

        City newYork = new City();
        Comparable<NewCapital> comparable = (Comparable)newYork;
    }
}
