package com.gla.String.Level3;
import java.util.Scanner;
public class CharFrequency {
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

    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int len = getLength(text);

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        String[][] temp = new String[len][2];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                temp[count][0] = String.valueOf(ch);
                temp[count][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // mark as counted
                count++;
            }
        }

        String[][] result = new String[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = temp[i][0];
            result[i][1] = temp[i][1];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqData = findFrequency(input);

        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqData.length; i++) {
            System.out.println(freqData[i][0] + "\t\t" + freqData[i][1]);
        }
    }

}
