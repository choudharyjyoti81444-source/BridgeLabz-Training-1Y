package com.gla.Generics_Collections.Collection;

import java.util.*;

class Policy {
    String policyNo;
    String name;
    String expiry;
    String type;
    double premium;

    Policy(String policyNo, String name, String expiry, String type, double premium) {
        this.policyNo = policyNo;
        this.name = name;
        this.expiry = expiry;
        this.type = type;
        this.premium = premium;
    }

    public String toString() {
        return policyNo + " | " + name + " | " + expiry + " | " + type + " | " + premium;
    }
}

public class InsuranceSystem {
    public static void main(String[] args) {
        HashSet<Policy> hashSet = new HashSet<>();
        LinkedHashSet<Policy> linkedSet = new LinkedHashSet<>();

        TreeSet<Policy> treeSet = new TreeSet<>(new Comparator<Policy>() {
            public int compare(Policy a, Policy b) {
                return a.expiry.compareTo(b.expiry);
            }
        });

        Policy p1 = new Policy("P101", "Aman", "2026-05-10", "Health", 5000);
        Policy p2 = new Policy("P102", "Riya", "2026-04-20", "Auto", 3000);
        Policy p3 = new Policy("P103", "Neha", "2026-05-01", "Home", 7000);
        Policy p4 = new Policy("P104", "Raj", "2026-04-15", "Health", 6000);

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);

        linkedSet.add(p1);
        linkedSet.add(p2);
        linkedSet.add(p3);
        linkedSet.add(p4);

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);

        System.out.println("=== ALL POLICIES (HashSet) ===");
        for (Policy p : hashSet) {
            System.out.println(p);
        }

        System.out.println("\n=== INSERTION ORDER (LinkedHashSet) ===");
        for (Policy p : linkedSet) {
            System.out.println(p);
        }

        System.out.println("\n=== SORTED BY EXPIRY (TreeSet) ===");
        for (Policy p : treeSet) {
            System.out.println(p);
        }

        System.out.println("\n=== HEALTH POLICIES ===");
        for (Policy p : hashSet) {
            if (p.type.equals("Health")) {
                System.out.println(p);
            }
        }
    }
}
