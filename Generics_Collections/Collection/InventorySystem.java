package com.gla.Generics_Collections.Collection;

import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return name + " | " + price + " | " + stock;
    }
}
public class InventorySystem {
    public static void main(String[] args) {
        Set<String> productSet = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restocked = new Stack<>();

        addProduct("Milk", 50, 5, productSet, products);
        addProduct("Bread", 30, 2, productSet, products);
        addProduct("Rice", 100, 1, productSet, products);
        addProduct("Milk", 50, 5, productSet, products); // duplicate ignored

        System.out.println("Products:");

        for (Product p : products) {
            System.out.println(p);
        }

        for (Product p : products) {
            if (p.stock < 3) {
                restockQueue.add(p);
            }
        }

        System.out.println("\nRestocking...");

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.remove();
            p.stock += 10;
            restocked.push(p);
            System.out.println("Restocked: " + p);
        }

        System.out.println("\nUndo Last Restock:");
        if (!restocked.isEmpty()) {
            Product p = restocked.pop();
            p.stock -= 10;
            System.out.println("Undo: " + p);
        }
    }

    static void addProduct(String name, double price, int stock,
                           Set<String> set, List<Product> list) {

        if (!set.contains(name)) {
            set.add(name);
            list.add(new Product(name, price, stock));
        }
    }
}
