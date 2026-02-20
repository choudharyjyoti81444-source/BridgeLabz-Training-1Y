package com.gla.BuiltInFunction.PracticeProblem2;
import java.util.Scanner;

public class FactorialRecursion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = takeInput();
        long result = calculateFactorial(number);
        displayResult(number, result);
    }

    // Function to take input from user
    public static int takeInput() {
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        while (num < 0) {
            System.out.print("Please enter a non-negative integer: ");
            num = sc.nextInt();
        }
        return num;
    }

    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void displayResult(int num, long factorial) {
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
