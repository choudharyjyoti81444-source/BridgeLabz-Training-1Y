package com.gla.BuiltInFunction.PracticeProblem2;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        int low = 1;
        int high = 100;
        boolean guessed = false;

        while (!guessed) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(guess);

            switch (feedback.toLowerCase()) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number: " + guess);
                    guessed = true;
                    break;
                default:
                    System.out.println("Please enter 'high', 'low', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Hmm, something went wrong. Are you sure about your responses?");
                break;
            }
        }
    }

    // Generate a random guess within the current range
    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    // Ask user for feedback on the guess
    public static String getFeedback(int guess) {
        System.out.println("Is your number " + guess + "? (high/low/correct): ");
        return sc.nextLine().trim();
    }
}
