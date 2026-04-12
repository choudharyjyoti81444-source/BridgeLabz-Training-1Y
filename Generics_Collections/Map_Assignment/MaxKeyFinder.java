package com.gla.Generics_Collections.Map_Assignment;

public class MaxKeyFinder {
    public static void main(String[] args) {
        String[] keys = {"A", "B", "C"};
        int[] values = {10, 20, 15};

        String maxKey = keys[0];
        int maxValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                maxKey = keys[i];
            }
        }

        System.out.println(maxKey);

    }

}
