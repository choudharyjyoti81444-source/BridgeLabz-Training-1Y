package com.gla.Array.level2;

import java.util.Scanner;

public class LargestSecondLargestDigitDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. index
        int index = 0;

        // d, e, f. Extract digits and store in array
        while (number != 0) {
            int lastDigit = number % 10;

            // If array is full, increase its size by 10
            if (index == maxDigit) {
                maxDigit += 10; // increase size

                // b. create temp array and copy elements
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp; // assign back
            }

            digits[index] = lastDigit;
            index++;

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
