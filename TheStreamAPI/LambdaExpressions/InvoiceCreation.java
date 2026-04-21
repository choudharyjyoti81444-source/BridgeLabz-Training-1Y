package com.gla.TheStreamAPI.LambdaExpressions;

import java.util.*;

class Invoice {
    int id;

    Invoice(int id) {
        this.id = id;
    }
}
public class InvoiceCreation {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1, 2, 3);

        List<Invoice> list = new ArrayList<>();

        ids.forEach(i -> list.add(new Invoice(i)));

        for (Invoice inv : list) {
            System.out.println(inv.id);
        }
    }
}
