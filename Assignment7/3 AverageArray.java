//: Calculate the Average of Array Elements Using For-Each
//Write a Java program that prompts the user to input an array of integers and then calculates
//and prints the average of all elements in the array using a for-each loop.
package Assignment7;
import java.util.Scanner;

class AverageArray {
  public static void main(String[] args) {
Scanner input = new Scanner(System.in);
   System.out.print("Welcome to Average Array\n");
   System.out.print("Enter the Size of Array:");
   int size = input.nextInt();
   int[] array = new int[size]; // initialize the array of size
   System.out.println("Enter The Array");

   for (int i = 0; i < size; i++) { // put the value 1 by 1 in 0array using for loop
    System.out.print("Element " + (i + 1) + " ");
    array[i] = input.nextInt();
   }
   //for Each loop
//   int sum = 0;
//   for (int n : array){
//    sum  = sum+n;
//   }
//   float avg = (float)sum/array.length; //type casting

   //using loop
   int sum = 0;
   for (int i = 0; i< size;  i++){
    sum = sum+array[i];
   }
   float avg = (float)sum/array.length;

   System.out.println("the average of array is:" +avg);

  }
}
