package com.gla.Array.level2;

import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. 2D array to store marks for 3 subjects
        int[][] marks = new int[n][3];  // [student][subject]
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                int mark = sc.nextInt();

                // Validate input
                if (mark < 0) {
                    System.out.println("Invalid input! Marks cannot be negative. Enter again.");
                    j--; // decrement to re-enter the same subject
                    continue;
                }

                marks[i][j] = mark;
            }
        }

        // d. Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

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
                    marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}
