//Problem 1: Find the Largest Element in an Array
//Description:
//Write a Java program that prompts the user to input the size of an array and then the elements
//of the array. The program should then find and print the largest element in the array.
package Assignment7;

import java.util.Scanner;

class LargerstElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to Array Searching \n");
        System.out.print("Enter the Size of Array:");
        int size = input.nextInt();
        int[] array = new int[size]; //
        System.out.println("Enter The Array");

        for (int i = 0; i < size; i++){
            System.out.print("Element " +(i+1)+" ");
            array[i]=input.nextInt();
        }

        int largest = array[0];
        for (int i =1; i< size; i++){
            if (array[i] > largest){
                largest = array[i];
            }
        }
        System.out.println("the largest element in the array is:" +largest);


    }
}
