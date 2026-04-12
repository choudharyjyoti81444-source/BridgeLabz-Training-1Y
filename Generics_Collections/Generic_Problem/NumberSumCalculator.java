package com.gla.Generics_Collections.Generic_Problem;

import java.util.*;
public class NumberSumCalculator {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);

        List<Double> l2 = new ArrayList<>();
        l2.add(1.5);
        l2.add(2.5);
        l2.add(3.0);

        System.out.println(sumNumbers(l1));
        System.out.println(sumNumbers(l2));
    }
}
