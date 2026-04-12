package com.gla.Generics_Collections.Generic_Problem;

import java.util.*;

class ElectronicItem {
    String itemName;
    ElectronicItem(String itemName) {
        this.itemName = itemName;
    }

    public String toString() {
        return itemName;
    }
}

class ClothItem {
    String itemName;

    ClothItem(String itemName) {
        this.itemName = itemName;
    }

    public String toString() {
        return itemName;
    }
}

class CartBox<T> {
    ArrayList<T> data = new ArrayList<>();
    public void addItem(T obj) {
        data.add(obj);
    }

    public void removeItem(T obj) {
        data.remove(obj);
    }

    public void displayItems() {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }
}

public class MainCart {
    public static void main(String[] args) {
        CartBox<ElectronicItem> cart1 = new CartBox<>();
        cart1.addItem(new ElectronicItem("TV"));
        cart1.addItem(new ElectronicItem("Speaker"));

        CartBox<ClothItem> cart2 = new CartBox<>();
        cart2.addItem(new ClothItem("Jacket"));
        cart2.addItem(new ClothItem("T-Shirt"));

        cart1.displayItems();
        cart2.displayItems();
    }
}
