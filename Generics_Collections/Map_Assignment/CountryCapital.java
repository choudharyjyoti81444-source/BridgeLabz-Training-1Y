package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;
public class CountryCapital {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("USA", "Washington DC");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Italy", "Rome");
        map.put("Canada", "Ottawa");
        map.put("Australia", "Canberra");

        String input = "Japan";
        if (map.containsKey(input)) {
            System.out.println("Capital = " + map.get(input));
        }
        else {
            System.out.println("Unknown country");
        }
        TreeMap<String, String> sorted = new TreeMap<>(map);
        System.out.println("\nAll Countries (Sorted):");
        for (String key : sorted.keySet()) {
            System.out.println(key + " = " + sorted.get(key));
        }
    }
}
