//find the reverse no in java
package Assignment1;
import java.util.Scanner;
 class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no:");

        int number = scanner.nextInt();
        int digit;
        int rev = 0;

        while(number != 0){
            digit =  number % 10;
            rev  = rev * 10 + digit;
            number = number / 10;
        }
        System.out.println("The reverse no is:" + rev);
    }
}
