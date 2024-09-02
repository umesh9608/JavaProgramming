package Assignment2;

import java.util.Scanner;

// Write a C program to accept the height of a person in centimeters and
//categorize them as follows:
// Dwarf if height < 150 cm
// Average height if height is between 150 cm and 165 cm
// Tall if height is greater than 165 cm
public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the your height in cm: ");

        int h = scanner.nextInt();

        if(h < 150){
            System.out.println("Dwarf");
        } else if (h >= 156 && h <= 165) {
            System.out.println("Average");
        } else if (h > 165) {
            System.out.println("Tall");
        }

    }
}