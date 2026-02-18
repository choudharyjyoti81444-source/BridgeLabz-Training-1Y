package com.gla.String.Level1;
import java.util.Scanner;
public class UppercaseComparison {
    public static String toUpperUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
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

        System.out.print("Enter complete text: ");
        String text = scanner.nextLine();

        String upperManual = toUpperUsingCharAt(text);

        String upperBuiltIn = text.toUpperCase();

        boolean comparisonResult = compareStrings(upperManual, upperBuiltIn);

        System.out.println("Uppercase using charAt(): " + upperManual);
        System.out.println("Uppercase using toUpperCase(): " + upperBuiltIn);
        System.out.println("Are both results equal? " + comparisonResult);

    }
}
