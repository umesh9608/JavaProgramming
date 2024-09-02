//10) Check if Two Strings are Equal
//Description: Write a Java program that prompts the user to input two strings and checks if
//they are equal.
//Hint:
// Use the equals() method to compare the strings and store the result in a boolean variable.
package Assignment5;

import java.util.Scanner;

class CheckTwoStringEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Check if Two String are Equal");
        System.out.println("Please Enter First String:");
        String num1 = input.nextLine();
        System.out.print("Enter the second number: ");
        String num2 = input.nextLine();

        if(num1.length() == num2.length() ){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

    }
}
