package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;
public class LongestWordFinde {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence = takeInput();
        String longestWord = findLongestWord(sentence);
        displayResult(longestWord);
    }

    public static String takeInput() {
        System.out.print("Enter a sentence: ");
        return sc.nextLine();
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void displayResult(String longestWord) {
        System.out.println("Longest word: " + longestWord);
    }
}
