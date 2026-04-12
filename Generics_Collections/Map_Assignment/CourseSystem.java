package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;
public class CourseSystem {
    public static void main(String[] args) {
        HashMap<String, Integer> course = new HashMap<>();
        course.put("CS101", 48);
        course.put("CS102", 3);
        course.put("CS103", 55);
        course.put("CS104", 20);
        course.put("CS105", 5);

        String addCourse = "CS101";
        course.put(addCourse, course.get(addCourse) + 5);
        String dropCourse = "CS102";
        int val = course.get(dropCourse) - 2;

        if (val < 0) {
            course.put(dropCourse, 0);
        }
        else {
            course.put(dropCourse, val);
        }

        System.out.println("Near Full Courses (>=50):");
        for (String key : course.keySet()) {
            if (course.get(key) >= 50) {
                System.out.println(key + " = " + course.get(key));
            }
        }

        System.out.println("\nUnder Subscribed Courses (<5):");
        for (String key : course.keySet()) {
            if (course.get(key) < 5) {
                System.out.println(key + " = " + course.get(key));
            }
        }
    }
}
