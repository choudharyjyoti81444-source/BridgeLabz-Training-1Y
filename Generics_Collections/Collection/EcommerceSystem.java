package com.gla.Generics_Collections.Collection;

import java.util.*;

class Order {
    int orderId;
    String name;
    Order(int orderId, String name) {
        this.orderId = orderId;
        this.name = name;
    }

    public String toString() {
        return orderId + " " + name;
    }

    public boolean equals(Object o) {
        Order other = (Order) o;
        return this.orderId == other.orderId;
    }

    public int hashCode() {
        return orderId;
    }
}
public class EcommerceSystem {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order(1, "Laptop"));
        list.add(new Order(2, "Mobile"));
        list.add(new Order(1, "Laptop")); // duplicate
        list.add(new Order(3, "Shoes"));

        Set<Order> set = new HashSet<>(list);
        Queue<Order> queue = new LinkedList<>(set);
        Stack<Order> failed = new Stack<>();
        System.out.println("Processing Orders:");

        while (!queue.isEmpty()) {
            Order o = queue.remove();
            System.out.println("Processing: " + o);
            if (o.orderId == 2) {
                System.out.println("Failed: " + o);
                failed.push(o);
            }
        }

        System.out.println("\nRetry Failed Orders:");
        while (!failed.isEmpty()) {
            System.out.println("Retry: " + failed.pop());
        }
    }
}
