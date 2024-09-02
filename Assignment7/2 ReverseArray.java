//Problem 2: Reverse an Array
//Write a Java program that takes an array of integers from the user and prints the array in reverse order.
package Assignment7;

import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Array Searching \n");
        System.out.print("Enter the Size of Array:");
        int size = input.nextInt();
        int[] array = new int[size]; // initialize the array of size
        System.out.println("Enter The Array");

        for (int i = 0; i < size; i++) { // put the value 1 by 1 in array using for loop
            System.out.print("Element " + (i + 1) + " ");
            array[i] = input.nextInt();
        }

        System.out.print("The array is: ");
        for (int i = array.length - 1; i >= 0; i--){ //print the reverse array
            System.out.print(array[i] + " ");
        }

    }
}
