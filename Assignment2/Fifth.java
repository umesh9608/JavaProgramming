package Assignment2;

import java.util.Scanner;

//Write a C program to read the age of a candidate and determine whether they are eligible to vote.
public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = scanner.nextInt();
        if(age > 18){
            System.out.println("Congratulation! You are eligible for casting your vote.");

        }else {
            System.out.println("You are not eligible for vote");
        }
    }
}

