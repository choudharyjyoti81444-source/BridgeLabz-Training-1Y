package com.gla.TheStreamAPI.StreamAPI;

import java.util.*;
public class NameTransform {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ram", "shyam", "aman");

        list.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
