package com.gla.Methods.Level2;
import java.util.Scanner;
public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // column 0: weight, 1: height, 2: BMI

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            teamData[i][1] = scanner.nextDouble();

            teamData[i][2] = calculateBMI(teamData[i][0], teamData[i][1]);
        }

        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            double weight = teamData[i][0];
            double height = teamData[i][1];
            double bmi = teamData[i][2];
            String status = determineBMIStatus(bmi);

            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", weight, height, bmi, status);
        }

    }
}
