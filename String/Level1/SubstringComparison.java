package com.gla.String.Level1;
import java.util.Scanner;
public class SubstringComparison {
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Invalid index range!");
        } else {

            String sub1 = createSubstringUsingCharAt(text, start, end);

            String sub2 = text.substring(start, end);

            boolean comparisonResult = compareStrings(sub1, sub2);

            System.out.println("Substring using charAt(): " + sub1);
            System.out.println("Substring using substring(): " + sub2);
            System.out.println("Are both substrings equal? " + comparisonResult);
        }
    }

}
