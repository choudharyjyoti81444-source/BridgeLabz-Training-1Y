package com.gla.Generics_Collections.Generic_Problem;
import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) {
        this.name = name;
    }
}

class electronics extends WarehouseItem {
    electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    ArrayList<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public ArrayList<T> getItems() {
        return items;
    }
}
public class WarehouseManager {
    public static void showAll(List<? extends WarehouseItem> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name);
        }
    }

    public static void main(String[] args) {
        Storage<electronics> eStore = new Storage<>();
        eStore.addItem(new electronics("TV"));
        eStore.addItem(new electronics("Laptop"));

        Storage<Groceries> gStore = new Storage<>();
        gStore.addItem(new Groceries("Rice"));
        gStore.addItem(new Groceries("Wheat"));

        Storage<Furniture> fStore = new Storage<>();
        fStore.addItem(new Furniture("Chair"));
        fStore.addItem(new Furniture("Table"));

        showAll(eStore.getItems());
        showAll(gStore.getItems());
        showAll(fStore.getItems());
    }
}
