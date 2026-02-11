package com.gla.Array.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b. Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] years = new double[10];

        // c. Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // d. Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Years of Service: ");
            double yrs = sc.nextDouble();

            // Validate input
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input! Please enter again.\n");
                i--;  // decrement index to repeat the input for same employee
                continue;
            }

            salary[i] = sal;
            years[i] = yrs;
        }

        // e. Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // f. Print results
        System.out.println("\n--- Bonus Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                    ", Bonus = " + bonus[i] +
                    ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Paid by Zara: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
