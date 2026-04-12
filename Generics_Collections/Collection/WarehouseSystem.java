package com.gla.Generics_Collections.Collection;

import java.util.*;

class Package {
    String id;
    String name;
    Package(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " | " + name;
    }
}
public class WarehouseSystem {
    public static void main(String[] args) {
        Queue<Package> pending = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        addPackage(pending, ids, new Package("P1", "Mobile"));
        addPackage(pending, ids, new Package("P2", "Laptop"));
        addPackage(pending, ids, new Package("P3", "Shoes"));
        addPackage(pending, ids, new Package("P1", "Mobile")); // duplicate ignored

        System.out.println("Processing Deliveries:");

        while (!pending.isEmpty()) {
            Package p = pending.remove();

            if (p.id.equals("P2")) {
                System.out.println("Returned: " + p);
                returned.push(p);
            }
            else {
                System.out.println("Delivered: " + p);
                delivered.add(p);
            }
        }

        System.out.println("\nDelivered Packages:");
        for (Package p : delivered) {
            System.out.println(p);
        }

        System.out.println("\nReturned Packages:");
        while (!returned.isEmpty()) {
            System.out.println(returned.pop());
        }
    }

    static void addPackage(Queue<Package> q, Set<String> set, Package p) {

        if (!set.contains(p.id)) {
            set.add(p.id);
            q.add(p);
        }
    }
}
