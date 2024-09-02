//Description: Write a Java program that prompts the user to input a string and then prints the
//string in reverse order.
//Hint:
// Use the charAt() method to access characters in the string.
// Iterate through the string from the last character to the first and build the reversed string.
// You can also explore using the StringBuilder class and its reverse() method
package assignment4;
import java.util.Scanner;
class Reverse_A_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");

        String input = scanner.nextLine();  // Take the input as a string
        StringBuilder reversedString = new StringBuilder();

        // Iterate from the end of the string to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString.append(input.charAt(i));
        }

        System.out.println("The reversed string is: " + reversedString.toString());
    }
}
