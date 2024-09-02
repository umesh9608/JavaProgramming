package Assignment2;
//Write a C program to accept two integers and check whether they are equal
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the  number: ");

        int num1 = scanner.nextInt();
        System.out.print("Enter the  number: ");
        int num2 = scanner.nextInt();
        if(num1 == num2){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

    }
}
