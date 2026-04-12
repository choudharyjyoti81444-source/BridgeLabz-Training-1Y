package com.gla.Generics_Collections.Map_Assignment;

import  java.util.*;
public class BankingSystem {
    public static void main(String[] args) {
        HashMap<String, Double> bank = new HashMap<>();
        bank.put("ACC101", 5000.0);
        bank.put("ACC102", 12000.0);
        bank.put("ACC103", 8000.0);
        bank.put("ACC104", 2000.0);
        bank.put("ACC105", 15000.0);

        String acc = "ACC101";
        double deposit = 2000.0;
        bank.put(acc, bank.get(acc) + deposit);
        String wAcc = "ACC104";
        double withdraw = 3000.0;

        if (bank.get(wAcc) >= withdraw) {
            bank.put(wAcc, bank.get(wAcc) - withdraw);
        }
        else {
            System.out.println(wAcc + " → Insufficient Balance");
        }

        List<String> list = new ArrayList<>(bank.keySet());
        Collections.sort(list, (a, b) -> bank.get(b).compareTo(bank.get(a)));
        System.out.println("\nCustomers by Balance (High to Low):");
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i);
            System.out.println(key + " = " + bank.get(key));
        }

        System.out.println("\nTop 3 Customers:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            String key = list.get(i);
            System.out.println(key + " = " + bank.get(key));
        }
    }
}
