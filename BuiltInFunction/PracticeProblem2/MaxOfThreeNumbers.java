package com.gla.BuiltInFunction.PracticeProblem2;
import java.util.Scanner;

public class MaxOfThreeNumbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = takeInput("Enter first number: ");
        int num2 = takeInput("Enter second number: ");
        int num3 = takeInput("Enter third number: ");

        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }

    // Function to take input from user
    public static int takeInput(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
