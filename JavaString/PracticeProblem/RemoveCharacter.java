package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;
public class RemoveCharacter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = takeInput("Enter a string: ");
        char ch = takeCharInput("Enter the character to remove: ");
        String result = removeCharacter(input, ch);
        displayResult(result);
    }

    public static String takeInput(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static char takeCharInput(String message) {
        System.out.print(message);
        return sc.next().charAt(0);
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void displayResult(String result) {
        System.out.println("Modified String: " + result);
    }
}
