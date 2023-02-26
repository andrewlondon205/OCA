package com.pluralsight.oracle.oca.encapsulation.blueprint;

public class Main {

    public static void main(String[] args) {

        System.out.println(UnitConverter.fromKgsToLbs(100));
        System.out.println(UnitConverter.fromNmToMeters(2));

        Position p1 = Position.origin();
        Position p2 = Position.of(10,20);
        Position p3 = Position.fromLatLonString("45 78");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
