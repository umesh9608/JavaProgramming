//Description: Write a Java program that prompts the user to input a series of numbers until
//they input a duplicate number. Use a while loop to check for duplicates.
//Hint:
// Use a HashSet to store unique numbers.
// In each iteration of the while loop, check if the number is already in the set.
// If it is a duplicate, terminate the loop; otherwise, add it to the set.
package Assignment3;

import java.util.Scanner;
import java.util.HashSet;

class StoreUniqueNumbers {

    public static void main(String[] args) {
        // Create a HashSet object
        HashSet<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter No: ");
        int num = scanner.nextInt();

        // Add the user input to the HashSet
        numbers.add(num);

        // Add some predefined numbers to the HashSet
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // Check for numbers from 1 to 10 in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
