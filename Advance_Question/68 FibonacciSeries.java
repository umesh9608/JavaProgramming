/*Create a program using recursion to display fibonacci series upto a certion number */
package Advance_Question;

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Printing Fibonacci Series.");
        System.out.println("Enter the element to ");
        int count = input.nextInt();
        for (int i = 1; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position) {
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }
}
