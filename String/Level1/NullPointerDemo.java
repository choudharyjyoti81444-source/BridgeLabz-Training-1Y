package com.gla.String.Level1;

public class NullPointerDemo {
    public static void generateException() {
        String text = null;

        System.out.println("Length: " + text.length());
    }

    public static void handleException() {
        String text = null;

        try {
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled successfully.");
        }
    }

    public static void main(String[] args) {

        System.out.println("---- Demonstrating Exception Generation ----");

        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in main method.");
        }

        System.out.println("\n---- Demonstrating Exception Handling ----");

        handleException();
    }

}
