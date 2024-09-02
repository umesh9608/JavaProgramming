//Sum of Positive Integers Until User Enters 0
//Description: Write a Java program that prompts the user to input a series of integers until
//they enter 0. Calculate and print the sum of all the positive integers entered using a while loop.
// Hint:
//  Use a while loop to repeatedly prompt the user for input.
//  Add only the positive integers to a sum variable.
//  Terminate the loop when the user inputs 0.
package Assignment4;
import java.util.Scanner;
 class SomeOfPositiveNumber {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int sum = 0;

         while (true) {
             System.out.print("Enter an integer (0 to stop): ");
             int num = scanner.nextInt();

             if (num == 0) {
                 break;  // num = 0 then Exit the loop
             }

             if (num > 0) {
                 sum += num;  // Add only positive integers to the sum
             }
         }

         System.out.println("The sum of positive integers is: " + sum);

     }
}
