package com.gla.TheStreamAPI.StreamAPI;

import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}
public class ClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> list = Arrays.asList(
                new Claim("Health", 1000),
                new Claim("Health", 2000),
                new Claim("Car", 3000),
                new Claim("Car", 5000)
        );

        Map<String, Double> map =
                list.stream().collect(
                        Collectors.groupingBy(
                                c -> c.type,
                                Collectors.averagingDouble(c -> c.amount)
                        )
                );

        System.out.println(map);
    }
}
