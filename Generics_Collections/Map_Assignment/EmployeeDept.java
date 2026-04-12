package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;
public class EmployeeDept {
    public static void main(String[] args) {
        HashMap<Integer, String> emp = new HashMap<>();
        emp.put(101, "IT");
        emp.put(102, "HR");
        emp.put(103, "IT");
        emp.put(104, "Sales");
        emp.put(105, "HR");
        emp.put(103, "Finance");
        String searchDept = "HR";
        System.out.println("Employees in " + searchDept + ":");
        for (Integer id : emp.keySet()) {
            if (emp.get(id).equals(searchDept)) {
                System.out.println(id);
            }
        }

        HashMap<String, Integer> count = new HashMap<>();
        for (Integer id : emp.keySet()) {
            String dept = emp.get(id);
            if (count.containsKey(dept)) {
                count.put(dept, count.get(dept) + 1);
            }
            else {
                count.put(dept, 1);
            }
        }

        System.out.println("\nDepartment Count:");
        for (String key : count.keySet()) {
            System.out.println(key + " = " + count.get(key));
        }
    }
}
