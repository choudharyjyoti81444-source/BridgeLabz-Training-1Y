package com.gla.String.Level2;
import java.util.Scanner;
public class StringSplitter {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitText(String str) {
        int len = findLength(str);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            int end = spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }

        String lastWord = "";
        for (int i = start; i < len; i++) {
            lastWord += str.charAt(i);
        }
        words[spaceCount] = lastWord;

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

        String[] customSplit = splitText(input);
        String[] builtInSplit = input.split(" ");

        System.out.print("Custom split: ");
        for (String word : customSplit) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.print("Built-in split: ");
        for (String word : builtInSplit) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.println("Arrays are equal: " + compareArrays(customSplit, builtInSplit));


    }
}
