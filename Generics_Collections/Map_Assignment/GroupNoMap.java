package com.gla.Generics_Collections.Map_Assignment;

public class GroupNoMap {
    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Carol"};
        String[] dept = {"HR", "IT", "HR"};

        String[] uniqueDept = new String[10];
        int size = 0;

        for (int i = 0; i < dept.length; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (dept[i].equals(uniqueDept[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                uniqueDept[size] = dept[i];
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(uniqueDept[i] + " : [");
            for (int j = 0; j < names.length; j++) {
                if (dept[j].equals(uniqueDept[i])) {
                    System.out.print(names[j] + " ");
                }
            }

            System.out.println("]");
        }
    }
}
