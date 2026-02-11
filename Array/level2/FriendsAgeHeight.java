package com.gla.Array.level2;

import java.util.Scanner;
public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Arrays to store age and height
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Input age and height for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height (in cm): ");
            height[i] = sc.nextDouble();
        }

        // b. Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            // Youngest
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            // Tallest
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // c. Display results
        System.out.println("\nYoungest friend: " + names[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + height[tallestIndex] + " cm)");
    }
}
