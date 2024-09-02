// Check if a Number is Prime
//Description:
//Write a Java program that includes a method named isPrime that takes an integer as a
//parameter and returns a boolean indicating whether the number is prime. The program should
//prompt the user to input a number, call the method, and print whether the number is prime.
//Concepts Covered:
// Creating methods with parameters
// Returning boolean values from a method
// Using loops and conditional statements inside a method
package Assignment9;
import java.util.Scanner;
class CheckNoIsPrime {
        // Method to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false; // 0 and 1 are not prime
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false; // Found a divisor, so it's not prime
                }
            }
            return true; // If no divisors found, it's prime
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int number = input.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
}