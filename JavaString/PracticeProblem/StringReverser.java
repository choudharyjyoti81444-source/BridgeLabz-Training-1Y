package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;

public class StringReverser {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = takeInput();
        String reversed = reverseString(input);
        displayResult(reversed);
    }

    public static String takeInput() {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void displayResult(String reversed) {
        System.out.println("Reversed string: " + reversed);
    }
}
