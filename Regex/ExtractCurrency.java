package com.gla.Regex;

import java.util.*;
import java.util.regex.*;
public class ExtractCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("\\$?[0-9]+(\\.[0-9]{2})?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + ", ");
        }
    }
}
