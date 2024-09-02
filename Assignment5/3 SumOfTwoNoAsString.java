//3) Sum of Two Numbers as Strings
//Description: Write a Java program that prompts the user to input two numbers as strings and
//then adds them together as integers.
package Assignment5;

import java.util.Scanner;

class SumOfTwoNoAsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sum of Two Numbers as Strings");
        System.out.print("Enter the first number: ");
        String num1 = scanner.nextLine();
        System.out.print("Enter the second number: ");
        String num2 = scanner.nextLine();

        // Convert the string inputs to integers
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        int sum = number1 + number2; //add the number

        System.out.println("The sum of the two numbers is: " + sum);


    }
}
