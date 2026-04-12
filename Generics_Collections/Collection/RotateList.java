package com.gla.Generics_Collections.Collection;

import java.util.*;
public class RotateList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k = 2;
        for (int i = 0; i < k; i++) {
            int temp = list.remove(0);
            list.add(temp);
        }

        System.out.println(list);
    }
}
