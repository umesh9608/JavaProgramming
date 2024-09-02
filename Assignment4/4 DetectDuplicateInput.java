/*  Detect Duplicate Input
Description: Write a Java program that prompts the user to input a series of numbers until
they input a duplicate number. Use a while loop to check for duplicates.
Hint:
  Use a HashSet to store unique numbers.
  In each iteration of the while loop, check if the number is already in the set.
  If it is a duplicate, terminate the loop; otherwise, add it to the set.*/
package Assignment4;
import java.util.Scanner;
import java.util.HashSet;  //also use HashSet package
 class DetectDuplicateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (uniqueNumbers.contains(num)) {
                System.out.println("Duplicate detected! The number " + num + " is already in the set.");
                break;  // Exit the loop if a duplicate is found
            } else {
                uniqueNumbers.add(num);  // Add the number to the set if it's not a duplicate
            }
        }
    }
}
