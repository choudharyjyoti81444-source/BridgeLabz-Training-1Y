package com.gla.Generics_Collections.Collection;

import java.util.*;
public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> rev = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            rev.add(list.get(i));
        }

        System.out.println(rev);
    }
}
