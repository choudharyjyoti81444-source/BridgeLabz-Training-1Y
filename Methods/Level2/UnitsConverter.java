package com.gla.Methods.Level2;

public class UnitsConverter {
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    private static final double YARDS_TO_FEET = 3.0;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }

    public static void main(String[] args) {
        System.out.println("5 km in miles: " + convertKmToMiles(5));
        System.out.println("3 miles in km: " + convertMilesToKm(3));
        System.out.println("10 meters in feet: " + convertMetersToFeet(10));
        System.out.println("20 feet in meters: " + convertFeetToMeters(20));
        System.out.println("7 yards in feet: " + convertYardsToFeet(7));
        System.out.println("15 feet in yards: " + convertFeetToYards(15));
        System.out.println("2 meters in inches: " + convertMetersToInches(2));
        System.out.println("50 inches in meters: " + convertInchesToMeters(50));
        System.out.println("12 inches in cm: " + convertInchesToCm(12));
    }

}
