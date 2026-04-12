package com.gla.Generics_Collections.Generic_Problem;

import java.util.*;

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}

public class AnimalViewer {
    public static void printAnimals(List<? extends Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i).name);
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Tommy"));
        dogs.add(new Dog("Sheru"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Kitty"));
        cats.add(new Cat("Minnie"));

        printAnimals(dogs);
        printAnimals(cats);
    }
}
