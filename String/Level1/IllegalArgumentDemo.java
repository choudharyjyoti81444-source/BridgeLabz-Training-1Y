package com.gla.String.Level1;
import java.util.Scanner;
public class IllegalArgumentDemo {
    public static void generateException(String text) {

        System.out.println("Substring: " + text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("IllegalArgumentException (StringIndexOutOfBoundsException) handled.");
            System.out.println("Invalid substring indexes.");
        } catch (RuntimeException e) {

            System.out.println("RuntimeException handled: " + e.getMessage());
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
