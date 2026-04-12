package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase();
        text = text.replace(",", "");
        text = text.replace("!", "");

        String[] words = text.split(" ");

        String[] unique = new String[10];
        int[] count = new int[10];
        int size = 0;

        for (int i = 0; i < words.length; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (words[i].equals(unique[j])) {
                    count[j]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[size] = words[i];
                count[size] = 1;
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.println(unique[i] + " = " + count[i]);
        }
    }

}
