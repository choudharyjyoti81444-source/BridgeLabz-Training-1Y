package com.gla.Regex;

import java.util.Scanner;
public class HexColorValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();

        if (color.matches("^#[0-9a-fA-F]{6}$")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
