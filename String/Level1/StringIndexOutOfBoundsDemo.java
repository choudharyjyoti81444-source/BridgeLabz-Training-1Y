package com.gla.String.Level1;
import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {

        System.out.println("Character: " + text.charAt(text.length()));
    }

    public static void handleException(String text) {

        try {
            System.out.println("Character: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled successfully.");
            System.out.println("Invalid index accessed.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        System.out.println("\n---- Generating Exception ----");

        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main method.");
        }

        System.out.println("\n---- Handling Exception ----");

        handleException(text);

    }
}
