//Description: Write a Java program that prompts the user to input a series of numbers until
//they input a duplicate number. Use a while loop to check for duplicates.
//Hint:
// Use a HashSet to store unique numbers.
// In each iteration of the while loop, check if the number is already in the set.
// If it is a duplicate, terminate the loop; otherwise, add it to the set.

package Assignment3;

import java.util.Scanner;
import java.util.HashSet;

 class storeUniqueNumbers {

    public static void main(String[] args) {
       //create a HashSet object
        HashSet<Integer> numbers = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter No: ");
        int num = scanner.nextInt();


















        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        //show
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }




    }
}
