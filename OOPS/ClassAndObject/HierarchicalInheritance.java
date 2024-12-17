package OOPS.ClassAndObject;

/* One base class and many derived classes */
public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Create objects of each derived class
        Mamal_ mammal = new Mamal_();
        Fish_ fish = new Fish_();
        Bird bird = new Bird();

        // Demonstrating hierarchical inheritance
        System.out.println("Mammal:");
        mammal.color = "Brown";  // Inherited property
        mammal.eat();            // Inherited method
        mammal.breathe();        // Inherited method
        mammal.walk();           // Mammal specific method

        System.out.println("\nFish:");
        fish.color = "Golden";   // Inherited property
        fish.eat();              // Inherited method
        fish.breathe();          // Inherited method
        fish.swim();             // Fish specific method

        System.out.println("\nBird:");
        bird.color = "White";    // Inherited property
        bird.eat();              // Inherited method
        bird.breathe();          // Inherited method
        bird.fly();              // Bird specific method
    }
}

// Base class
class Animal__ {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// Derived class Mamal_
class Mamal_ extends Animal__ {
    void walk() {
        System.out.println("Walks on land");
    }
}

// Derived class Fish
class Fish_ extends Animal__ {
    void swim() {
        System.out.println("Swims in water");
    }
}

// Derived class Bird
class Bird extends Animal__ {
    void fly() {
        System.out.println("Flies in the sky");
    }
}
