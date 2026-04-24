package com.gla.Regex;

import java.util.*;
import java.util.regex.*;

public class SSNValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("\\b[0-9]{3}-[0-9]{2}-[0-9]{4}\\b");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Valid: " + matcher.group());
        } else {
            System.out.println("Invalid");
        }
    }
}
