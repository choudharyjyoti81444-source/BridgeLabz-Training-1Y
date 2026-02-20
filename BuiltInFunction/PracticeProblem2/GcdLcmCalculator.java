package com.gla.BuiltInFunction.PracticeProblem2;
import java.util.Scanner;

public class GcdLcmCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = takeInput("Enter the first number: ");
        int num2 = takeInput("Enter the second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        displayResult(num1, num2, gcd, lcm);
    }

    public static int takeInput(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":");
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
