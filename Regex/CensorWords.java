package com.gla.Regex;

import java.util.Scanner;
public class CensorWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] badWords = {"damn", "stupid"};

        for (String word : badWords) {
            text = text.replaceAll("\\b" + word + "\\b", "****");
        }

        System.out.println(text);
    }
}
