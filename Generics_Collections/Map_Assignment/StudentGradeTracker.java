package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("Riya", 85.0);
        map.put("Aman", 78.0);
        map.put("Neha", 92.0);
        map.put("Aman", 88.0);
        map.remove("Neha");

        TreeMap<String, Double> sorted = new TreeMap<>(map);
        for (String name : sorted.keySet()) {
            System.out.println(name + " = " + sorted.get(name));
        }
    }
}
