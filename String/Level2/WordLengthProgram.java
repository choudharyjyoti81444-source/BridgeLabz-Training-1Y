package com.gla.String.Level2;
import java.util.Scanner;
public class WordLengthProgram {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] splitWords(String text) {
        int len = getLength(text);
        String[] temp = new String[len];
        int wordCount = 0;
        String word = "";

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (getLength(word) > 0) {
                    temp[wordCount++] = word;
                    word = "";
                }
            }
        }

        if (getLength(word) > 0) {
            temp[wordCount++] = word;
        }

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            words[i] = temp[i];
        }

        return words;
    }

    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = getLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] wordData = getWordLengthArray(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < wordData.length; i++) {
            String word = wordData[i][0];
            int length = Integer.parseInt(wordData[i][1]);
            System.out.println(word + "\t" + length);
        }

    }
}
