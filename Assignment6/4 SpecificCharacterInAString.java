//Description: Write a Java program that prompts the user to input a string and a character to
//search for. The program should use a loop to search for the first occurrence of the character in
//the string and use break to exit the loop once found.
package Assignment6;

import java.util.Scanner;

class SpecificCharacterInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Search Character");
        System.out.print("Enter String:");
        String inputString = input.nextLine();

        System.out.print("Enter the Character:");
        char charSearch = input.next().charAt(0);

        for (int i = 0; i< inputString.length(); i++){
            if(inputString.charAt(i) == charSearch) {
                System.out.println("Character'" + charSearch + " 'found at index:" + i);
            }
        }
    }
}
