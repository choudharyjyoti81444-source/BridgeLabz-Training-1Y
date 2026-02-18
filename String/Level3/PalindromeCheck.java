package com.gla.String.Level3;
import java.util.Scanner;
public class PalindromeCheck {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Logic 1: Iterative check using start and end indexes
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = getLength(text) - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using reversed array
    public static char[] reverseString(String text) {
        int len = getLength(text);
        char[] rev = new char[len];
        for (int i = 0; i < len; i++) {
            rev[i] = text.charAt(len - i - 1);
        }
        return rev;
    }

    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        int len = original.length;
        for (int i = 0; i < len; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, getLength(input) - 1);
        boolean result3 = isPalindromeUsingArray(input);

        System.out.println("Palindrome check using iterative method: " + result1);
        System.out.println("Palindrome check using recursive method: " + result2);
        System.out.println("Palindrome check using reversed array: " + result3);

    }
}
