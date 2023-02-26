package com.pluralsight.oracle.oca.encapsulation.calculator;

import com.pluralsight.oracle.oca.encapsulation.aircraft.RadarAircraft;

public class Main {

    public static void main(String[] args) {

        NewRadarAircraft ro123 = new NewRadarAircraft("", 200, new Coordinate(0, 0), new Coordinate(2, 3), new Coordinate(5, 6));

        //Calculate distance
        double ro123TotalDistance = ro123.calculateDistance();
        System.out.println("Total distance is " + ro123TotalDistance);
        System.out.println(ro123.getPastRoute());

        //Change altitude
        ro123.setAltitudeFL(200);
    }
}
