package com.gla.Generics_Collections.Map_Assignment;

public class InventorySystem {
    public static void main(String[] args) {
        String[] items = {"Milk", "Bread", "Rice"};
        int[] qty = {10, 5, 20};

        String buyItem = "Milk";
        int buyQty = 3;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(buyItem)) {
                qty[i] = qty[i] - buyQty;

                if (qty[i] <= 0) {
                    qty[i] = 0;
                }
            }
        }

        String newItem = "Bread";
        int addQty = 10;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(newItem)) {
                qty[i] = qty[i] + addQty;
            }
        }

        String query = "Rice";
        boolean found = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(query)) {
                System.out.println(query + " = " + qty[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("not stocked");
        }

        System.out.println("Out of stock items:");
        for (int i = 0; i < items.length; i++) {
            if (qty[i] == 0) {
                System.out.println(items[i]);
            }
        }
    }
}
