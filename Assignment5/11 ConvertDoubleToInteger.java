//11) Convert a Double to an Integer
//Description:  Write a Java program that prompts the user to input a decimal number (double)
//and then converts it to an integer.
package Assignment5;

import java.util.Scanner;

class ConvertDoubleToInteger {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Double To Integer Convertor");
         System.out.print("Please Enter the Real No:");
         double myDouble = input.nextDouble();

         int myInt = (int) myDouble; // Explicit casting: double to int
         System.out.print(myInt);
     }
}
