package com.gla.Generics_Collections.Collection;

import java.util.*;
public class BinaryQueue {
    public static void main(String[] args) {
        int n = 5;
        Queue<String> q = new LinkedList<>();
        ArrayList<String> result = new ArrayList<>();

        q.add("1");
        for (int i = 1; i <= n; i++) {
            String s = q.remove();
            result.add(s);

            q.add(s + "0");
            q.add(s + "1");
        }

        System.out.println(result);
    }
}
