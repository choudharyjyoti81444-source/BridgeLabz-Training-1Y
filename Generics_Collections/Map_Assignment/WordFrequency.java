package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;
public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
            else {
                map.put(word, 1);
            }
        }

        System.out.println("Word Count:");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
