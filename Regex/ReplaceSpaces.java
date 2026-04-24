package com.gla.Regex;

import java.util.Scanner;
public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        text = text.replaceAll(" +", " ");

        System.out.println(text);
    }
}
