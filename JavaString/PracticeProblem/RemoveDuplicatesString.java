package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class RemoveDuplicatesString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = takeInput();
        String result = removeDuplicates(input);
        displayResult(result);
    }

    public static String takeInput() {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void displayResult(String result) {
        System.out.println("String after removing duplicates: " + result);
    }
}
