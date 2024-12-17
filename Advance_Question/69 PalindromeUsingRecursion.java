/* Create a program using recursion to check if string is palindrome */
package Advance_Question;

import java.util.Scanner;

class PalindromeUsingRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker.");
        System.out.println("Enter the string to be checked:");
        String str = input.next();
        System.out.println("Your String is " + (isPalindrome(str) ? "a Palindrome" : "Not a Palindrome"));
        input.close();
    }

    public static boolean isPalindrome(String str) {
        // Base case: If the string has 1 or 0 characters, it is a palindrome
        if (str.length() <= 1) {
            return true;
        }

        int lastPos = str.length() - 1;

        // Check if the first and last characters are the same
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }

        // Recursive case: Check the substring excluding the first and last characters
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
