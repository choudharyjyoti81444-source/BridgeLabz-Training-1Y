package com.gla.BuiltInFunction.PracticeProblem2;
import java.util.Scanner;

public class FibonacciGenerator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = sc.nextInt();

        generateFibonacci(n);
    }

    // Function to calculate and print Fibonacci sequence
    public static void generateFibonacci(int terms) {
        if (terms <= 0) {
            System.out.println("Number of terms must be positive.");
            return;
        }

        long first = 0, second = 1;
        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
