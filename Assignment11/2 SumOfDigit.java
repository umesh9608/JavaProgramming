/* Write a Java program that takes an integer as input and recursively calculates the sum of its
digits. For example, if the input is 1234, the program should return 10 (because 1 + 2 + 3 +
4 = 10). The program should include a method named sumOfDigits that performs this
calculation using recursion.  */
package Assignment11;

import java.util.Scanner;

class SumOfDigit {
    public static int sumdigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Find sum of Number");
        System.out.println("Please, Enter the Number:");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Please, Enter the +ve Number.");
        } else {
            int result = sumdigit(num);
            System.out.println("Sum of" + num + " is:" + result);
        }
    }
}
