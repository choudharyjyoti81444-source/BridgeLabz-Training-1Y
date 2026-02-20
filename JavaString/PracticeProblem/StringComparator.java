package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;
public class StringComparator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = takeInput("Enter first string: ");
        String str2 = takeInput("Enter second string: ");
        int result = compareStrings(str1, str2);
        displayResult(str1, str2, result);
    }

    public static String takeInput(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int compareStrings(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

    public static void displayResult(String s1, String s2, int result) {
        if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

}
