package com.gla.WrapperClass;

import java.util.ArrayList;
public class PerformanceTest {
    public static void main(String[] args) {
        int n = 1_000_000;
        long start1 = System.currentTimeMillis();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        long sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
        }

        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(i);
        }

        long sum2 = 0;
        for(int i = 0; i < list.size(); i++) {
            sum2 += list.get(i);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("Array sum = " + sum1 + ", Time = " + (end1 - start1) + " ms");
        System.out.println("ArrayList sum = " + sum2 + ", Time = " + (end2 - start2) + " ms");
    }
}
