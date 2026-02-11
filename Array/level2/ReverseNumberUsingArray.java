package com.gla.Array.level2;

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input for a number
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

        // d. Create array to store reversed digits
        int[] reversed = new int[digitCount];

        // Copy digits in reverse order
        for (int i = 0; i < digitCount; i++) {
            reversed[i] = digits[digitCount - 1 - i];
        }

        // Display the reversed array
        System.out.print("Reversed Number (using array): ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversed[i]);
        }
    }
}
