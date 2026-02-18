package com.gla.String.Level3;
import java.util.Scanner;
public class CharFrequencyNestedLoop {
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

    public static String[] frequencyUsingNestedLoops(String text) {
        int len = getLength(text);
        char[] chars = new char[len];
        for (int i = 0; i < len; i++) {
            chars[i] = text.charAt(i);
        }

        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') count++;
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] freqData = frequencyUsingNestedLoops(input);

        System.out.println("Character : Frequency");
        for (int i = 0; i < freqData.length; i++) {
            System.out.println(freqData[i]);
        }

    }

}
