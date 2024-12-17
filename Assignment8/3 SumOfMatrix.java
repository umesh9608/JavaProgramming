/* Problem 3: Find the Sum of Each Row and Column in a Matrix
Description:
Write a Java program that prompts the user to input a 3x3 matrix and then calculates and
prints the sum of each row and each column of the matrix.
Concepts Covered:
 Looping through rows and columns in a 2D array
 Accessing and manipulating elements in a 2D array
Hint:
 Use nested for loops to iterate through the rows and columns separately, maintaining
separate sums for rows and columns.*/
package Assignment8;
import java.util.Scanner;

class SumOfMatrix {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   System.out.println("Welcome to Matrix sum");
      System.out.println("Now, enter 3 * 3 matrix");
   int array[][][] = new int[3][3][3];
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              for (int k = 0; k <3 ; k++) {
                  System.out.print("Element at [" + i + "][" + j + "]: ");
                 array[i][j][k] = input.nextInt();
              }
//              System.out.print("Element at [" + i + "][" + j + "]: ");
//              array[i][j] = input.nextInt();
          }
      }
  }
}
