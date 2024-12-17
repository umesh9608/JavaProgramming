/* question: Take a string as input.
Use a method that iterates over each character of the string and appends only non-whitespace characters to a new string.
Return and display the modified string without any white spaces*/
package Lab_Work;

import java.util.Scanner;

public class RemoveWhiteSpace {

    public static String remWhitSpc(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String newString = remWhitSpc(input);
        System.out.println("Modified string without whitespaces: " + newString);

    }

}
/*  // remove white spaces
        input = input.replaceAll("\\s", "");
        System.out.println("Final String: " + input);
*/