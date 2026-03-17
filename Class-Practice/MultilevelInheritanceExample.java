// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Main class
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}
