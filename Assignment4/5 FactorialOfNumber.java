/* Calculate Factorial of a Number
Description: Write a Java program that prompts the user to enter a positive integer and
calculates its factorial using a while loop.
Hint:
 Initialize a factorial variable to 1.
 Use a while loop to multiply the factorial variable by each number down to 1. */
package Assignment4;
import java.util.Scanner;
 class FactorialOfNumber {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a positive integer: ");
         int number = scanner.nextInt();

         // Validate if the input is a positive integer
         if (number < 0) {
             System.out.println("Please enter a positive integer.");
         } else {
             int factorial = 1;
             int i = number;


             while (i > 0) {
                 factorial *= i; // Multiply factorial by the current number
                 i--;
             }
             System.out.println("The factorial of " + number + " is: " + factorial);
         }
     }

 }
