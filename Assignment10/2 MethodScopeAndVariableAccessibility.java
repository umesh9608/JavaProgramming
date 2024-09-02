//Problem 2: Method Scope and Variable Accessibility
//Description:
//Write a Java program that defines a class with a method sum that takes two integer parameters
//and returns their sum. Inside the main method, declare an integer variable result and call the
//sum method. Also, create another method named multiply that takes two integers and
//multiplies them, returning the result. Try to access the result variable defined in main from
//within the multiply method and observe what happens.
//Concepts Covered:
// Method scope and variable accessibility
// Understanding that variables declared inside a method are not accessible outside that method
package Assignment10;

class MathOperations {

    // Method to calculate the sum of two integers
    public int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate the product of two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperations operations = new MathOperations();

        // Call the sum method and store the result in a variable
        int result = operations.sum(5, 10);
        System.out.println("The sum is: " + result);

        // Call the multiply method and print the result
        int product = operations.multiply(3, 4);
        System.out.println("The product is: " + product);

        // Example of how to call multiply method with another variable
        int anotherProduct = operations.multiply(2, result); // Correct way to call multiply
        System.out.println("The product of 2 and result is: " + anotherProduct);
    }
}
