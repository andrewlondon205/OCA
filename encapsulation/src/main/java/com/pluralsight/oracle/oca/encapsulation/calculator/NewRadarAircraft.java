package com.pluralsight.oracle.oca.encapsulation.calculator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewRadarAircraft {

    private String callSign;
    private int altitudeFL;
    private List<Coordinate> pastRoute;

    public NewRadarAircraft(String callSign, int altitudeFL, Coordinate ... pastRoute) {
        this.callSign = callSign;
        this.altitudeFL = altitudeFL;
        this.pastRoute = Arrays.asList(pastRoute);
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public void setPastRoute(List<Coordinate> pastRoute) {
        this.pastRoute = pastRoute;
    }

    public String getCallSign() {
        return callSign;
    }

    public int getAltitudeFL() {
        return altitudeFL;
    }

    public List<Coordinate> getPastRoute() {
        List<Coordinate> routeCopy = new ArrayList<>();
        this.pastRoute.forEach(c -> routeCopy.add(new Coordinate(c.getX(),c.getY())));
        return routeCopy;
    }

    public void setAltitudeFL (int altitudeFL) {
        if (altitudeFL < 0 || altitudeFL > 350)
            throw new IllegalArgumentException("Altitude must be positive or less than 350");

        this.altitudeFL = altitudeFL;
    }

    public double calculateDistance() {
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        return distanceCalculator.calculateHorizontalDistance(this.getPastRoute());
    }


}
