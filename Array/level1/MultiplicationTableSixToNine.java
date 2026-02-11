package com.gla.Array.level1;

import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define array to store multiplication results (6 to 9 → 4 values)
        int[] multiplicationResult = new int[4];

        // b. Calculate multiplication table from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }

        // c. Display the result
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
    }
}
