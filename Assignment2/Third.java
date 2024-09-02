package Assignment2;

import java.util.Scanner;

//Write a C program to check whether a given number is positive or negativ
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");

        int num = scanner.nextInt();
        if(num >= 0){
            System.out.println("+ve No");
        }else {
            System.out.println("-Ve No");
        }
    }
}
