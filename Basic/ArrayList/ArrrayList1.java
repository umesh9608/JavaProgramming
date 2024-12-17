package Basic.ArrayList;

import java.util.ArrayList;
import java.util.Collections;  // Import Collections class for sorting
import java.util.Scanner;

public class ArrrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        System.out.println("Enter 5 integers: ");
        Scanner input = new Scanner(System.in);

        // Loop to get input from the user
        for (int i = 0; i < 5; i++) {
            int temp = input.nextInt();

            // Only add the number if it's not already in the list
            if (!integer.contains(temp)) {
                integer.add(temp);
            }
        }

        // Sorting the list
        Collections.sort(integer);

        // Printing the sorted list
        System.out.println(integer);

        input.close(); // Closing the Scanner object
    }
}
