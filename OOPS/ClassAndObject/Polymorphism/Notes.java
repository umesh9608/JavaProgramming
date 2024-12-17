package OOPS.ClassAndObject.Polymorphism;

public class Notes {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Correct usage of overloaded methods
        System.out.println(calc.sum(1, 2));                // Calls int sum(int a, int b)
        System.out.println(calc.sum(1.5f, 2.5f));          // Calls float sum(float a, float b)
        System.out.println(calc.sum(1, 2, 3));             // Calls int sum(int a, int b, int c)
    }
}

class Calculator {
    // Overloaded sum method for two integers
    int sum(int a, int b) {
        return a + b;
    }

    // Overloaded sum method for two floats
    float sum(float a, float b) {
        return a + b;
    }

    // Overloaded sum method for three integers
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

    /*two types
    1, compile time polymorphism (method overloading) static called
    method overloading :- multiple function with the same name but different parameter
    2, Run time polymorphism  (method overriding) dynamic called
    */