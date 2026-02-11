package com.gla.Array.level2;

import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // b. 2D array to store height, weight and BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // c. Input height and weight
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Input and validate height
            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Try again.");
                }
            } while (height <= 0);

            // Input and validate weight
            double weight;
            do {
                System.out.print("Enter weight (in kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Try again.");
                }
            } while (weight <= 0);

            personData[i][0] = height;
            personData[i][1] = weight;
        }

        // d. Calculate BMI and status
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // e. Display results
        System.out.println("\n--- BMI Results ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
