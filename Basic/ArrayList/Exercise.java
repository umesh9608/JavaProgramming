/*Create a menu program with the following options:
1. add element   2.remove element  3.Display element  4.Exit  */
package Basic.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        ArrayList<Integer> integer = new java.util.ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true){
            displayMenu();
            int choice = input.nextInt();

            if(choice == 1){
                //add
                System.out.print("Enter an integer");
                integer.add(input.nextInt());
                System.out.println("Added");
            }else if (choice == 2){
                //remove
                System.out.println("Enter the number to remove: ");
                int elementToRemove = input.nextInt();
                if(integer.contains(elementToRemove)) {
                    integer.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Removed.");
                }else {
                    System.out.println("Element not found.");
                }

            }else if (choice == 3){
                System.out.println("Your List:" + integer);
            }else if (choice == 4){
                System.out.println("Good Bye");
                break;
            }
        }
    }


    private static void displayMenu(){
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Your Choice: ");
    }
}
