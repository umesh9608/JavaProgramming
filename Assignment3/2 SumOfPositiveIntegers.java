// Sum of Positive Integers Until User Enters 0
//Description: Write a Java program that prompts the user to input a series of integers until
//they enter 0. Calculate and print the sum of all the positive integers entered using a while

package Assignment3;
import java.util.Scanner;

 class SumOfPositiveIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Series of integer no: ");
        int num = scanner.nextInt();
        int sum = 0;
        while(num != 0){
            if(num > 0){
                sum += num;

            }
            num = scanner.nextInt();
        }
        System.out.println("Sum of All +ve integer is:" +sum);

    }
}
