package com.gla.TheStreamAPI.StreamAPI;

import java.util.*;
public class EventWelcome {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Aman");

        names.forEach(n -> System.out.println("Welcome " + n));
    }
}
