package com.gla.Array.level2;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Arrays to store marks, percentages, and grades
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            System.out.print("Physics: ");
            int p = sc.nextInt();

            System.out.print("Chemistry: ");
            int c = sc.nextInt();

            System.out.print("Maths: ");
            int m = sc.nextInt();

            // Validate input
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid input! Marks cannot be negative. Enter again.");
                i--; // decrement index to re-enter marks for the same student
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        // d. Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = (total / 300.0) * 100;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // e. Display results
        System.out.println("\n--- Student Results ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10c\n",
                    physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}
