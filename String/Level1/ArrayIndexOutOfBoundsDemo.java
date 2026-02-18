package com.gla.String.Level1;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names) {
        System.out.println("Accessing name: " + names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing name: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled successfully.");
            System.out.println("Invalid array index accessed.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }

        System.out.println("\n---- Generating Exception ----");

        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main method.");
        }

        System.out.println("\n---- Handling Exception ----");

        handleException(names);

    }


}
