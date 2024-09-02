//Description: Write a Java program that takes a number as input and calculates the sum of its digits.
package Assignment1;

import java.util.Scanner;


 class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");

        int num = scanner.nextInt();
        int sum = 0;
        while(num != 0){
            int digit = num % 10;  //extreact the last digit
            sum += digit;  //add digit to the sum
            num = num / 10;  //remove the last digit
        }
        System.out.println("The Sum of digit is:" + sum);
    }
}
