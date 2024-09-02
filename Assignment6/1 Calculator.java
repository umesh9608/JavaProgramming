//Simple Calculator Using Switch
//Description: Write a Java program that functions as a simple calculator. The program should
//prompt the user to input two numbers and an operator (+, -, *, /) and use a switch statement to
//perform the appropriate operation.
package Assignment6;

import java.util.Scanner;

class Calculator {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Welcome to Calculate Two Number\n");
         System.out.print("Enter first number: ");
         double num1 = scanner.nextDouble();

         System.out.print("Enter an operator (+, -, *, /): ");
         char operator = scanner.next().charAt(0);

         System.out.print("Enter second number: ");
         double num2 = scanner.nextDouble();

         double result;


         switch (operator) {
             case '+':
                 result = num1 + num2;
                 break;
             case '-':
                 result = num1 - num2;
                 break;
             case '*':
                 result = num1 * num2;
                 break;
             case '/':
                 if (num2 != 0) {
                     result = num1 / num2;
                 } else {
                     System.out.println("Error! Division by zero is not allowed.");
                     return;
                 }
                 break;
             default:
                 System.out.println("Invalid operator! Please enter +, -, *, or /.");
                 return;
         }
         System.out.println("The result is: " + result);
     }
}
