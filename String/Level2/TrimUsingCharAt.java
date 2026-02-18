package com.gla.String.Level2;
import java.util.Scanner;
public class TrimUsingCharAt {
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

    public static int[] findTrimIndexes(String text) {
        int len = getLength(text);
        int start = 0;
        int end = len - 1;

        while (start < len && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        int len1 = getLength(str1);
        int len2 = getLength(str2);

        if (len1 != len2) {
            return false;
        }

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] indexes = findTrimIndexes(input);
        String customTrim = "";

        if (indexes[0] <= indexes[1]) {
            customTrim = createSubstring(input, indexes[0], indexes[1]);
        }

        String builtInTrim = input.trim();

        boolean isEqual = compareStrings(customTrim, builtInTrim);

        System.out.println("Custom Trim Result: \"" + customTrim + "\"");
        System.out.println("Built-in Trim Result: \"" + builtInTrim + "\"");
        System.out.println("Are both equal? " + isEqual);
    }
}
