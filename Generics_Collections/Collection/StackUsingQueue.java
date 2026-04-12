package com.gla.Generics_Collections.Collection;

import java.util.*;
public class StackUsingQueue {
    static Queue<Integer> q = new LinkedList<>();
    public static void push(int x) {
        q.add(x);
    }

    public static int pop() {
        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }

        return q.remove();
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        System.out.println(pop()); // 3
    }
}
