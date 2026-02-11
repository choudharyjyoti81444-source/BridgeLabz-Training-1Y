package com.gla.Array.level1;

import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Declare array, total, and index
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // c. Break if number is 0 or negative
            if (num <= 0) {
                break;
            }

            // d. Break if array size reaches 10
            if (index == 10) {
                break;
            }

            // e. Store number and increment index
            arr[index] = num;
            index++;
        }

        // f. Calculate total using for loop
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        // g. Display total
        System.out.println("\nTotal sum = " + total);
    }
}
