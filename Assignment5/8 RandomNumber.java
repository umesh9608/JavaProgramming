//8) Generate a Random Number Between 1 and 100
//Description: Write a Java program that generates and prints a random number between 1 and
//100.
//Hint:
// Use Math.random() and manipulate the result to fall within the desired range
package Assignment5;

import java.util.Scanner;

class RandomNumber {
     public static void main(String[] args) {
         System.out.println("Welcome to Generate Random Number");
         int randomNum = (int)(Math.random() * 101);  // 0 to 100
         System.out.println(randomNum);

     }
}
