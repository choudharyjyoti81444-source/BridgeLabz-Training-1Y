package com.gla.Array.level1;

import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b. Create double array of size 11
        double[] heights = new double[11];
        double sum = 0.0;

        // Get height input from the user
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
        }

        // c. Calculate sum of all elements
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // d. Calculate and display mean height
        double mean = sum / heights.length;
        System.out.println("Mean height of the football team = " + mean);
    }
}
