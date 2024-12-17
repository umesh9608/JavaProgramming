/*Problem 1: Matrix Addition
Description:
Write a Java program that performs the addition of two 2x2 matrices. The program should
prompt the user to input elements for two 2x2 matrices, then add the corresponding elements
of the matrices and store the result in a third matrix. Finally, the program should print the
resulting matrix.
Concepts Covered:
 Creation and initialization of a 2D array
 Accessing and modifying elements in a 2D array
 Looping through a 2D array
Hint:
 Use nested for loops to iterate through the rows and columns of the matrices and
perform element-wise addition. */
package Assignment8;

import java.util.Scanner;

class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter the no of rows:");
        int rows = input.nextInt();
        System.out.print("Now, enter the no of column:");
        int cols = input.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
            }

        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" "+array[i][j]);

            }
            System.out.println();
        }
    }

}
