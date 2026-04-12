package com.gla.Generics_Collections.Map_Assignment;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();
        cart.put("Laptop", 40000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);
        cart.put("Headphones", 2000.0);
        cart.remove("Mouse");
        System.out.println("Products in Cart:");
        for (String key : cart.keySet()) {
            System.out.println(key + " = " + cart.get(key));
        }

        double total = 0;
        for (String key : cart.keySet()) {
            total = total + cart.get(key);
        }

        System.out.println("\nTotal = " + total);
        if (total > 5000) {
            double discount = total * 0.10;
            total = total - discount;
            System.out.println("10% Discount Applied = " + discount);
        }
        System.out.println("Final Bill = " + total);
    }
}
