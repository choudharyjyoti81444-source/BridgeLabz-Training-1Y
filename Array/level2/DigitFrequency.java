package com.gla.Array.level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Find the count of digits
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        // c. Store digits in an array
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // d. Find frequency of each digit
        int[] frequency = new int[10];
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        // e. Display frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + ": " + frequency[i]);
        }
    }
}
