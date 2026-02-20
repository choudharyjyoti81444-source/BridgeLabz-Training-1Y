package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;
public class ToggleCase {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = takeInput();
        String toggled = toggleCase(input);
        displayResult(toggled);
    }

    public static String takeInput() {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static String toggleCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public static void displayResult(String result) {
        System.out.println("Toggled string: " + result);
    }
}
