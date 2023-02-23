package com.pluralsight.oracle.oca.encapsulation.aircraft;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RadarLabelOptions {

    private boolean showAltitudeTrendArrow;
    private boolean showSpeed;

    public boolean isShowAltitudeTrendArrow() {
        return showAltitudeTrendArrow;
    }

    public boolean isShowSpeed () {
        return showSpeed;
    }



}
