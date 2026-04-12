package com.gla.Generics_Collections.Collection;

import java.util.*;
public class CircularBuffer {
    public static void main(String[] args) {
        int size = 3;
        Queue<Integer> q = new LinkedList<>();

        int[] input = {1,2,3,4};
        for (int i = 0; i < input.length; i++) {
            if (q.size() == size) {
                q.remove();
            }

            q.add(input[i]);
        }

        System.out.println(q);
    }
}
