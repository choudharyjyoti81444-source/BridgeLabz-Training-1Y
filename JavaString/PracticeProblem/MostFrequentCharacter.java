package com.gla.JavaString.PracticeProblem;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class MostFrequentCharacter {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = takeInput();
        char mostFrequent = findMostFrequentChar(input);
        displayResult(mostFrequent);
    }

    public static String takeInput() {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    public static char findMostFrequentChar(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        char maxChar = str.charAt(0);
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return maxChar;
    }

    public static void displayResult(char ch) {
        System.out.println("Most Frequent Character: '" + ch + "'");
    }

}
