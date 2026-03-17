// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // Inherited method from Animal
        d.bark();  // Method from Dog class
    }
}

