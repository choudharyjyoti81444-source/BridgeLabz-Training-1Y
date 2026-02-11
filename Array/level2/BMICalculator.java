package com.gla.Array.level2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // b. Arrays to store data
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // c. Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();
        }

        // d. Calculate BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            // f. Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        // e. Display results
        System.out.println("\n--- BMI Results ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    height[i], weight[i], bmi[i], status[i]);
        }
    }
}
