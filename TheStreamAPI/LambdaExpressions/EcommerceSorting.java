package com.gla.TheStreamAPI.LambdaExpressions;

import java.util.*;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Phone", 20000));
        list.add(new Product("Laptop", 50000));
        list.add(new Product("Watch", 5000));

        list.sort((a, b) -> a.price - b.price);

        for (Product p : list) {
            System.out.println(p.name + " " + p.price);
        }
    }
}
