package com.gla.String.Level1;
import java.util.Scanner;
public class NumberFormatDemo {
    public static void generateException(String text) {

        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled successfully.");
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number as text: ");
        String text = scanner.next();

        System.out.println("\n---- Generating Exception ----");

        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught in main method.");
        }

        System.out.println("\n---- Handling Exception ----");

        handleException(text);
    }
}
