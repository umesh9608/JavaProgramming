package OOPS.ClassAndObject;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();  // Inherited method from Animal
        shark.swin(); // Fish-specific method
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// Derived class
class Fish extends Animal {  // Corrected: Fish now extends Animal
    int fins;

    void swin() {
        System.out.println("Swims in water");
    }
}

/*Inheritance is when properties & method of base class are passed on to a drive class
 * called base class and drive class*/