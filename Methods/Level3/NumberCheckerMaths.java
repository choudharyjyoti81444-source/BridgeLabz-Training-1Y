package com.gla.Methods.Level3;
import java.util.Scanner;
public class NumberCheckerMaths {
    public static int countDigits(int number) {
        int count = 0;
        int temp = Math.abs(number);
        if (temp == 0) return 1;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int n = countDigits(number);
        int[] digits = new int[n];
        int temp = Math.abs(number);
        for (int i = n - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += digit;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) sum += Math.pow(digit, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false;
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // frequency
        }
        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Number of digits: " + countDigits(number));
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number? " + (isHarshadNumber(number, digits) ? "Yes" : "No"));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        System.out.println("Digit  Frequency");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d       %d%n", freq[i][0], freq[i][1]);
        }

    }
}
