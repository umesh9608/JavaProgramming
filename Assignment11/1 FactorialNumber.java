/* Problem 1: Calculate Factorial Using Recursion
Description:
Write a Java program that calculates the factorial of a given number using recursion. The
program should prompt the user to input a positive integer and then use a recursive method
named factorial to compute the factorial of that number. The method should return the
factorial value, which will be printed in the main method.
Concepts Covered:
 Recursion
 Halting condition (base case)
Hint:
 The factorial of a number n is n * factorial(n - 1) with the base case
factorial(0) = 1.
 Ensure that the recursive method has a base case to stop the recursion.*/
package Assignment11;

import java.util.Scanner;

class FactorialNumber {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        // Ensure the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Call the recursive method and display the result
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
}
