package Assignment2;

import java.util.Scanner;

//Write a C program to find whether a given year is a leap year or not
public class Fourth {
    public static void main(String[] args) {
    /*    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");

        int year = 2016;

     */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  year: ");
        int year = scanner.nextInt();


        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("is a leap year:" +year);
                } else {
                    System.out.println("is a  not leap year:" +year);
                }
            } else {
                System.out.println("is a leap year:" +year);
            }
        } else {
            System.out.println("is a not  leap year:" +year);
        }

    }
    }