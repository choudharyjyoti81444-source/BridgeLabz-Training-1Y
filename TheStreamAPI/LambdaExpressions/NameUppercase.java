package com.gla.TheStreamAPI.LambdaExpressions;

import java.util.*;
public class NameUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shyam", "mohan");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
