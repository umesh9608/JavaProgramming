//write a Java program that prompts the user to enter a positive integer and
//calculates its factorial using a while loop.
package Assignment3;

import java.util.Scanner;

 class positiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a +ve integer: ");
        int num = scanner.nextInt();
        int factorial = 1;//multiplying by 1 doesn't change the value)
        int i = 1; //loop counter

        // Check if the input is positive
        if (num < 0) {
            System.out.println("Please enter a +ve integer.");
        } else {

            // Calculate factorial using a while loop
            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + num + " is: " + factorial);
        }


    }
}
