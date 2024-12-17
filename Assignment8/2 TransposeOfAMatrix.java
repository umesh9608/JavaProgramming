package Assignment8;

import java.util.Scanner;

class TransposeOfAMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Transpose Matrix");

        int[][] array = new int[3][3];
        System.out.println("Now, enter elements of 3*3 Matrix array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
            }
        }
        //
        //creating another matrix to store transpose of a matrix
        int transpose[][]=new int[3][3];  //3 rows and 3 columns

//Code to transpose a matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                transpose[i][j]=array[j][i];
            }
        }

        System.out.println("Printing Matrix without transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}
