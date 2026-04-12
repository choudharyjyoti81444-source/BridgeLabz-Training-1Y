package com.gla.Generics_Collections.Generic_Problem;

import java.util.ArrayList;

class Fruit {
    String name;
    Fruit(String name) {
        this.name = name;
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    Mango() {
        super("Mango");
    }
}

class FruitBox<T extends Fruit> {
    ArrayList<T> fruits = new ArrayList<>();
    public void add(T fruit) {
        fruits.add(fruit);
    }
    public void display() {
        for (T f : fruits) {
            System.out.println(f.name);
        }
    }
}
public class FruitStorageSystem {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.display();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());
        mangoBox.display();
    }
}
