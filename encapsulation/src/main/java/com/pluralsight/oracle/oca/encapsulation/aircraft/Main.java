package com.pluralsight.oracle.oca.encapsulation.aircraft;

public class Main {

    public static void main(String[] args) {

        RadarAircraft ro123 = new RadarAircraft("R0123",280,20,895,20000);

        int fuelConsumptionLitersPerHour = 2000;
        int ro123Range = ro123.calculateRange(fuelConsumptionLitersPerHour);

        System.out.println("Range is " + ro123Range + " km");
        System.out.println(fuelConsumptionLitersPerHour);

        RadarLabelOptions options = new RadarLabelOptions(true,false);
        System.out.println();
        ro123.printLabel(options);
        System.out.println(options.isShowAltitudeTrendArrow());
        System.out.println(options.isShowSpeed());

    }
}
