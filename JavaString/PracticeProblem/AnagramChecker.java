package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = takeInput("Enter the first string: ");
        String str2 = takeInput("Enter the second string: ");

        boolean result = areAnagrams(str1, str2);
        displayResult(str1, str2, result);
    }

    public static String takeInput(String message) {
        System.out.print(message);
        return sc.nextLine().replaceAll("\\s+", "").toLowerCase();
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void displayResult(String s1, String s2, boolean result) {
        if (result) {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are not anagrams.");
        }
    }
}
