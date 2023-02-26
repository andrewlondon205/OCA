package com.pluralsight.oracle.oca.encapsulation.flightplan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class FlightPlan {

    private String id;
    private String departure;
    private String destination;
    private LocalDateTime departureTime;
    private List<String> route;

    private FlightPlan () {
        System.out.println("FlightPlan() Constructor");
        this.id = UUID.randomUUID().toString();
    }

    public FlightPlan (String departure, String destination) {
        this();

        if(departure == null || destination == null) {
            throw new IllegalArgumentException();
        }

        System.out.println(String.format("FlightPlan( %s, %s)", departure, destination));
        this.departure = departure;
        this.destination = destination;
    }

    public FlightPlan (String departure, String destination, LocalDateTime departureTime, List<String> route) {
        this(departure,destination);

        if(departure == null || destination == null) {
            throw new IllegalArgumentException();
        }

        System.out.printf("FlightPlan( %s, %s, %s, %s) Constructor%n",departure,destination,departureTime.toLocalTime(),route.toString());

        this.departure = departure;
        this.destination = destination;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public List<String> getRoute() {
        return route;
    }

    public void setRoute(List<String> route) {
        this.route = route;
    }

    public void print() {
        System.out.println("FlightPlan{" +
                "id='" + id + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", route=" + route +
                '}');
    }
}
