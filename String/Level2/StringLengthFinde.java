package com.gla.String.Level2;
import java.util.Scanner;
public class StringLengthFinde {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int customLength = findLength(input);
        int builtInLength = input.length();
        System.out.println("Length calculated without using length(): " + customLength);
        System.out.println("Length calculated using built-in length(): " + builtInLength);
        sc.close();
    }
}
