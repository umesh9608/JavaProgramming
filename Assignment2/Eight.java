package Assignment2;

import java.util.Scanner;

// Write a C program to find the largest of three numbers.
public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st Number ");
        int a = scanner.nextInt();

        System.out.print("2st Number ");
        int b = scanner.nextInt();

        System.out.print("3st Number ");
        int c = scanner.nextInt();

        if(a > b && a > c){
            System.out.println("The 1rd Number is the greatest among three");
        } else if (b > a && b > c) {
            System.out.println("The 2rd Number is the greatest among three");
        }else{
            System.out.println("The 3rd Number is the greatest among three");
        }
    }
}
