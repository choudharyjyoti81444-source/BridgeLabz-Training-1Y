package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;
public class SubstringOccurrences {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String text = takeInput("Enter the main string: ");
        String substring = takeInput("Enter the substring to search: ");
        int count = countOccurrences(text, substring);
        displayResult(substring, count);
    }

    public static String takeInput(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int countOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    public static void displayResult(String substring, int count) {
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times.");
    }


}
