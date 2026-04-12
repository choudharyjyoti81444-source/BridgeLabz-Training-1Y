package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;
public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> marks = new HashMap<>();
        Map<String, Integer> math = new HashMap<>();
        math.put("Aman", 85);
        math.put("Riya", 92);
        math.put("Neha", 78);

        Map<String, Integer> science = new HashMap<>();
        science.put("Aman", 88);
        science.put("Riya", 75);
        science.put("Neha", 95);

        Map<String, Integer> english = new HashMap<>();
        english.put("Aman", 80);
        english.put("Riya", 89);
        english.put("Neha", 91);
        marks.put("Math", math);
        marks.put("Science", science);
        marks.put("English", english);

        System.out.println("Top Scorer per Subject:");
        for (String subject : marks.keySet()) {
            Map<String, Integer> students = marks.get(subject);
            String topper = "";
            int max = 0;
            for (String name : students.keySet()) {
                if (students.get(name) > max) {
                    max = students.get(name);
                    topper = name;
                }
            }
            System.out.println(subject + " = " + topper + " (" + max + ")");
        }

        System.out.println("\nAverage Score per Subject:");
        for (String subject : marks.keySet()) {
            Map<String, Integer> students = marks.get(subject);
            int sum = 0;
            int count = 0;
            for (String name : students.keySet()) {
                sum = sum + students.get(name);
                count++;
            }
            System.out.println(subject + " = " + (sum / count));
        }

        System.out.println("\nSubjects with 90+ scorer:");
        for (String subject : marks.keySet()) {
            Map<String, Integer> students = marks.get(subject);
            boolean found = false;
            for (String name : students.keySet()) {
                if (students.get(name) > 90) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(subject);
            }
        }
    }

}
