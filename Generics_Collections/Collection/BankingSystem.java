package com.gla.Generics_Collections.Collection;

import java.util.*;

class Transaction {
    String accId;
    int amount;
    Transaction(String accId, int amount) {
        this.accId = accId;
        this.amount = amount;
    }

    public String toString() {
        return accId + " " + amount;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        List<Transaction> allTransactions = new ArrayList<>();
        Queue<Transaction> pending = new LinkedList<>();
        Set<String> accounts = new HashSet<>();
        Stack<Transaction> rollback = new Stack<>();

        accounts.add("A1");
        accounts.add("A2");
        accounts.add("A3");

        pending.add(new Transaction("A1", 500));
        pending.add(new Transaction("A2", 1000));
        pending.add(new Transaction("A4", 700)); // invalid
        System.out.println("Processing Transactions:");

        while (!pending.isEmpty()) {
            Transaction t = pending.remove();
            if (accounts.contains(t.accId)) {
                System.out.println("Success: " + t);
                allTransactions.add(t);
                rollback.push(t);
            }
            else {
                System.out.println("Invalid Account: " + t.accId);
            }
        }

        System.out.println("\nRollback Last Transaction:");
        if (!rollback.isEmpty()) {
            Transaction last = rollback.pop();
            System.out.println("Reversing: " + last);
        }

        System.out.println("\nAll Transactions:");
        for (Transaction t : allTransactions) {
            System.out.println(t);
        }
    }
}
