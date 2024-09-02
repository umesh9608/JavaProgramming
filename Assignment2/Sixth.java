package Assignment2;
//Write a C program to read the value of an integer m and display the value of n
//as follows:
// n = 1 if m > 0
// n = 0 if m == 0
// n = -1 if m < 0
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Integer value: ");

        int m = scanner.nextInt();
        if(m >0){
            System.out.println("n = 1");
        } else if (m == 0){
            System.out.println("n = 0");
        } else if (m < 0) {
            System.out.println("n = -1");
        }
    }
}