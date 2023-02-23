package com.pluralsight.oracle.oca.encapsulation.aircraft;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static java.lang.System.lineSeparator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RadarAircraft {

    private String callSign;
    private int altitudeFL;
    private int rateClimbDescent;
    private int speedKmh;
    private int remainingFuel;

    public int calculateRange (int fuelConsumptionLitersPerHour) throws ArithmeticException{

        int flightHours = remainingFuel/fuelConsumptionLitersPerHour;
        //Just for explaining what happens when we change primitive type arguments into method
        fuelConsumptionLitersPerHour = 0;
        return flightHours * speedKmh;
    }

    public void printLabel (RadarLabelOptions displayOptions) {
        StringBuilder sb = new StringBuilder(callSign);
        sb.append(lineSeparator());
        sb.append("FL ").append(altitudeFL);

        if (displayOptions.isShowAltitudeTrendArrow()) {
            if (rateClimbDescent > 0 )
                sb.append(" ▲");
            else if (rateClimbDescent < 0)
                sb.append(" ▼");

        }
        if (displayOptions.isShowSpeed()) {
            sb.append(lineSeparator());
            sb.append(speedKmh).append(" kmh");
        }

        System.out.println(sb);
        displayOptions.setShowAltitudeTrendArrow(false);
    }

}
