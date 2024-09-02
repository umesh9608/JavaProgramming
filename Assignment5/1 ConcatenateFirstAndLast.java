//1) Concatenate First and Last Name
//Description: Write a Java program that prompts the user to input their first and last name
//separately and then concatenates them into a full name.
package Assignment5;

import java.util.Scanner;

class ConcatenateFirstAndLast {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Welcome to Concatenate First and Last Name");
         System.out.print("Please, Enter a First Name: ");
         String first = scanner.nextLine();
         System.out.print("Now, Enter the Last name:");
         String last = scanner.nextLine();

         System.out.println(first+ " " +last);

     }
}
