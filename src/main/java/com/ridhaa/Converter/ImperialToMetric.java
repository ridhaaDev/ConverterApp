package com.ridhaa.Converter;


public class ImperialToMetric {

    //Constants
    public static final double INCHES = 2.54;
    public static final double FEET = 3.28084;
    public static final double MILES = 1.60934;

    //Instance variables
    private double imperial;

    //Constructor
    //Default Constructor
    public ImperialToMetric() {

    }

    //Parametrised constructor
    public ImperialToMetric(double imperial) {
        this.imperial = imperial;
    }

    public double convertCmToInches() {
        double cm = this.imperial * INCHES;
        return cm;
    }

    public double convertMetersToFeet() {
        double cm = this.imperial * FEET;
        return cm;
    }

    public double convertKmToMiles() {
        double cm = this.imperial * MILES;
        return cm;
    }
    
}
