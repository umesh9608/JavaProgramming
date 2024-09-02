//2) Day of the Week
//Description: Write a Java program that takes an integer input from the user (1-7) and uses a
//switch statement to print the corresponding day of the week (e.g., 1 for Monday, 2 for
//Tuesday, etc.).
package Assignment6;

import java.util.Scanner;

class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculate Two Number\n");
        System.out.print("Enter The No From (1 - 7): ");
        int num = scanner.nextInt();
        double result;


        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
               break;

            default:
                System.out.println("Invalid Number ,Please Enter 1 To 7 Number");
        }

    }
}
