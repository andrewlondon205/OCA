package com.pluralsight.oracle.oca.encapsulation.calculator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coordinate {

    private final double x;
    private final double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
