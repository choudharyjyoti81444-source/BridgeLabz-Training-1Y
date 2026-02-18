package com.gla.String.Level1;
import java.util.Scanner;
public class LowercaseComparison {
    public static String toLowerUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }

        return result.toString();
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

        System.out.print("Enter complete text: ");
        String text = scanner.nextLine();

        String lowerManual = toLowerUsingCharAt(text);

        String lowerBuiltIn = text.toLowerCase();

        boolean comparisonResult = compareStrings(lowerManual, lowerBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowerManual);
        System.out.println("Lowercase using toLowerCase(): " + lowerBuiltIn);
        System.out.println("Are both results equal? " + comparisonResult);

    }
}
