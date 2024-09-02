//3) Find First Divisible Number
//Description: Write a Java program that iterates over numbers from 1 to 100 and finds the
//first number divisible by both 3 and 7. Use a break statement to exit the loop once the number is found.
package Assignment6;

import java.util.Scanner;

class DivisibleNumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to First Divisible Number");
         //int num = input.nextInt();
         for (int i = 1; i <= 100; i++) {
             if (i % 3 == 0 && i % 7 == 0) {
                 System.out.println("The first number divisible by both 3 and 7 is: " + i);
                 break;
             }
         }
     }
}
