//2) Create a Sentence Using Multiple Strings
//Description: Write a Java program that takes three different strings as input and concatenates
//them to form a complete sentence
package Assignment5;

import java.util.Scanner;

class MultipleString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Concatenate Multiple String");
        System.out.print("Please, Enter a First String: ");
        String first = scanner.nextLine();
        System.out.print("Now, Enter the middle String:");
        String middle = scanner.nextLine();
        System.out.print("Now, Enter the Last String:");
        String last = scanner.nextLine();

        System.out.println(first+ " " +middle+ " " +last+ ".");

    }

}
