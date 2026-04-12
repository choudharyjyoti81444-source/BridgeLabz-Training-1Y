package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;
public class AttendanceTracker {
    public static void main(String[] args) {
        HashMap<String, Integer> attendance = new HashMap<>();
        String[] students = {"Aman", "Riya", "Neha", "Raj", "Kiran"};
        for (int i = 0; i < students.length; i++) {
            attendance.put(students[i], 0);
        }
        String[][] days = {{"Aman", "Riya", "Neha"},
                {"Aman", "Raj"},
                {"Riya", "Neha", "Kiran"},
                {"Aman", "Riya"},
                {"Neha", "Raj"},
                {"Aman", "Kiran"},
                {"Riya", "Neha"},
                {"Aman", "Raj"},
                {"Riya"},
                {"Neha", "Kiran"},
                {"Aman", "Riya"},
                {"Raj"},
                {"Neha"},
                {"Aman", "Kiran"},
                {"Riya", "Raj"}};

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                String name = days[i][j];
                attendance.put(name, attendance.get(name) + 1);
            }
        }

        System.out.println("Attendance Count:");
        for (String key : attendance.keySet()) {
            System.out.println(key + " = " + attendance.get(key));
        }

        int threshold = 10;
        System.out.println("\nLow Attendance (<10 days):");
        for (String key : attendance.keySet()) {
            if (attendance.get(key) < threshold) {
                System.out.println(key);
            }
        }
    }
}
