package com.pluralsight.oracle.oca.encapsulation.blueprint;

public class UnitConverter {
    // Implement conversion from Nm to meters and from kgs to lbs
    private static final int metersInOneNm = 1852;

    public static double fromNmToMeters (double nm) {
        return nm * metersInOneNm;
    }

    public static double fromMetersToNm (double meters) {
        return meters / metersInOneNm;
    }

    private static final double lbsInOneKg = 2.2046226218;

    public static double fromKgsToLbs (int kgs) {
        return kgs * lbsInOneKg;
    }

    public static double fromLbsToKgs (int lbs) {
        return lbs / lbsInOneKg;
    }
}
