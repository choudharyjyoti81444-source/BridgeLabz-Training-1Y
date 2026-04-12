package com.gla.Generics_Collections.Collection;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2, 2, 3, 4));
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!result.contains(list.get(i))) {
                result.add(list.get(i));
            }
        }
        System.out.println(result);
    }
}