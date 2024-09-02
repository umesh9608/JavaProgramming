package Assignment1;

import java.util.Scanner;

//Write a Java program to multiply two numbers entered by the user and display the result.
public class sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");

        int num1 = scanner.nextInt();
        System.out.print("Enter the  number: ");

        int num2 = scanner.nextInt();
        System.out.println(num1 * num2);
    }
}
