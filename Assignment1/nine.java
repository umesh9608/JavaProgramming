package Assignment;

import java.util.Scanner;

// Check palindrome number
public class nine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //scanner obj to read input from the user

        System.out.print("Enter a number: ");  //enter the no
        int number = scanner.nextInt();  //read the no

        int r, sum = 0, t;  //number, remainder, reversed number, and temporary variable.
        t = number;

        while(number != 0){
            r = number % 10; //get last digit
            sum = sum * 10 + r; //reverse no
            number = number / 10;  //remove last digit
        }

        if(t == sum){  //check org no and rev no are same
            System.out.println(t + " is a palindrome.");
        } else {
            System.out.println(t + " is not a palindrome.");
        }
    }
}
