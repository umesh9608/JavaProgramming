//9) Check if a Number is Greater than 100
//Description: Write a Java program that prompts the user to input a number and checks if the
//number is greater than 100.
package Assignment5;

import java.util.Scanner;

class CheckNumberIsGrater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isGreaterThan100 = number > 100;

        if (isGreaterThan100) {
            System.out.println("The number is greater than 100.");
        } else {
            System.out.println("The number is not greater than 100.");
        }
    }
}

