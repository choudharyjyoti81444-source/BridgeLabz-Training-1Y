package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;
public class WordReplacer {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence = takeInput("Enter a sentence: ");
        String target = takeInput("Enter the word to replace: ");
        String replacement = takeInput("Enter the replacement word: ");

        String result = replaceWord(sentence, target, replacement);
        displayResult(result);
    }

    public static String takeInput(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replaceAll("\\b" + target + "\\b", replacement);
    }

    public static void displayResult(String result) {
        System.out.println("Modified Sentence: " + result);
    }
}
