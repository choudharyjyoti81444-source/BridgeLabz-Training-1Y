package com.gla.Generics_Collections.Generic_Problem;

import java.util.*;

class BookCategory {}
class ClothingCategory {}
class GadgetCategory {}

class product<T> {
    String name;
    double price;
    T category;

    product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String toString() {
        return name + " " + price;
    }
}

class Catalog {
    ArrayList<product<?>> list = new ArrayList<>();
    public void add(product<?> p) {
        list.add(p);
    }

    public void show() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

public class MarketplaceManager {
    public static <T extends product<?>> void applyDiscount(T p, double per) {
        p.price = p.price - (p.price * per / 100);
    }

    public static void main(String[] args) {
        product<BookCategory> b1 = new product<>("Java Book", 500, new BookCategory());
        product<ClothingCategory> c1 = new product<>("T-Shirt", 1000, new ClothingCategory());
        product<GadgetCategory> g1 = new product<>("Mobile", 20000, new GadgetCategory());

        applyDiscount(b1, 10);
        applyDiscount(c1, 20);
        applyDiscount(g1, 5);

        Catalog cat = new Catalog();
        cat.add(b1);
        cat.add(c1);
        cat.add(g1);

        cat.show();
    }
}
