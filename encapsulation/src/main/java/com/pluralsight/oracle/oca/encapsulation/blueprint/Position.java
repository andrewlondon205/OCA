package com.pluralsight.oracle.oca.encapsulation.blueprint;

public class Position {

    private double lat;
    private double lon;

    //Used to instantiate origin coordinate

    public static Position origin () {
        return new Position();
    }

    public static Position of (double lat, double lon ) {
        Position p = new Position();
        p.lon = lon;
        p.lat = lat;
        return p;
    }

    public static Position fromLatLonString (String position) {
        Position p = new Position();
        p.lat = Double.parseDouble(position.split(" ")[0]);
        p.lon = Double.parseDouble(position.split(" ")[1]);
        return p;
    }

    @Override
    public String toString() {
        return "Position{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
