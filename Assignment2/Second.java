package Assignment2;

import java.util.Scanner;

//Write a C program to check whether a given number is even or odd.
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");

        int num1 = scanner.nextInt();

        if(num1 %2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
