package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;
public class EmployeeSalary {
    public static void main(String[] args) {
        HashMap<String, Double> emp = new HashMap<>();
        emp.put("Aman", 50000.0);
        emp.put("Riya", 60000.0);
        emp.put("Neha", 55000.0);
        emp.put("Raj", 70000.0);
        emp.put("Kiran", 65000.0);
        emp.put("Sita", 60000.0);

        String name = "Riya";
        double percent = 10;
        if (emp.containsKey(name)) {
            double sal = emp.get(name);
            sal = sal + (sal * percent / 100);
            emp.put(name, sal);
        }
        else {
            System.out.println("Employee not found");
        }

        double sum = 0;
        for (String key : emp.keySet()) {
            sum = sum + emp.get(key);
        }

        double avg = sum / emp.size();
        System.out.println("Average Salary = " + avg);
        double max = 0;
        for (String key : emp.keySet()) {
            if (emp.get(key) > max) {
                max = emp.get(key);
            }
        }

        System.out.println("\nHighest Paid Employee(s):");
        for (String key : emp.keySet()) {
            if (emp.get(key) == max) {
                System.out.println(key + " = " + emp.get(key));
            }
        }
    }
}
