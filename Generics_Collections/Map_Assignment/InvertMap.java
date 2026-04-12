package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
            String[] keys = {"A","B","C"};
            int[] values = {1,2,1};

            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i] + " = [");
                for (int j = 0; j < values.length; j++) {
                    if (values[i] == values[j]) {
                        System.out.print(keys[j] + " ");
                    }
                }

                System.out.println("]");
            }
        }
}
