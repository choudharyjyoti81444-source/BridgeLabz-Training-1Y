package com.gla.String.Level1;
import java.util.Scanner;
public class CharArrayComparison {
    public static char[] getCharacters(String str) {

        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] userArray = getCharacters(text);

        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(userArray, builtInArray);

        System.out.print("Characters using user-defined method: ");
        for (char ch : userArray) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Are both character arrays equal? " + result);

        scanner.close();
    }
}
