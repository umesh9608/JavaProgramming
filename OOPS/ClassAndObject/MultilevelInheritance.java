package OOPS.ClassAndObject;
/*multilevel in one base class -> derive class -> drive class*/
public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.legs = 4;
        dobby.breed = "Labrador";  // Initializing breed

        // Accessing and printing properties
        System.out.println("Number of legs: " + dobby.legs);
        System.out.println("Breed: " + dobby.breed);

        dobby.eat();      // Inherited method from Animal_
        dobby.breathe();  // Inherited method from Animal_
    }
}

// Base class
class Animal_ {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// Intermediate class (Mammal inherits from Animal_)
class Mamal extends Animal_ {
    int legs;
}

// Derived class (Dog inherits from Mamal)
class Dog extends Mamal {
    String breed;
}
