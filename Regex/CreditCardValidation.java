package com.gla.Regex;
import java.util.Scanner;
public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.nextLine();

        if (card.matches("^(4[0-9]{15}|5[0-9]{15})$")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
