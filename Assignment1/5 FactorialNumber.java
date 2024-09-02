//: Write a Java program to find the factorial of a number entered by the user.
package Assignment1;
import java.util.Scanner;
 class FactorialNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        int i, fact = 1;
       //It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);

    }

}
