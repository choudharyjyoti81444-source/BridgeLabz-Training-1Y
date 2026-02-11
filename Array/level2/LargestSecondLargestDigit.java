package com.gla.Array.level2;

import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Array to store digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. index
        int index = 0;

        // d, e, f. Extract digits and store in array
        while (number != 0) {
            int lastDigit = number % 10;
            digits[index] = lastDigit;
            index++;

            // Stop if array is full
            if (index == maxDigit) {
                break;
            }

            number /= 10;
        }

        // g. Variables for largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // i. Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}