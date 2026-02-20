package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;

public class VowelConsonantCounter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = takeInput();
        int[] counts = countVowelsAndConsonants(input);
        displayResult(counts);
    }

    public static String takeInput() {
        System.out.print("Enter a string: ");
        return sc.nextLine().toLowerCase();
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void displayResult(int[] counts) {
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
}
