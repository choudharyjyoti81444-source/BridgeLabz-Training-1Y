package com.gla.Methods.Level1;
import java.util.Scanner;
public class TriangularRun {
    public static double calculateRounds(double side1, double side2, double side3, double distanceMeters) {
        double perimeter = side1 + side2 + side3;
        return distanceMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        double distanceMeters = 5000; // 5 km in meters
        double rounds = calculateRounds(side1, side2, side3, distanceMeters);

        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
    }
}
