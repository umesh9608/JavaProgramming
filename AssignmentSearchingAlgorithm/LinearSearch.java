/* Linear Search
Linear Search is a simple searching algorithm used to find the position of a target element in an array. It sequentially
checks each element of the array until the target is found or the end of the array is reached.
Memory Address 1010 1014 1018 1022 1026
Element of a 10 20 30 40 50
Index a[0] a[1] a[2] a[3] a[4*/
package AssignmentSearchingAlgorithm;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] array, int target){
        for(int i = 0; i< array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter "+size+ " integer for the array:");
        for(int i = 0; i<size; i++) {
            array[i] = scanner.nextInt();
        }
            System.out.println("Enter the target element to search for: ");
            int target = scanner.nextInt();

            int result = linearSearch(array,target);

            if(result != -1) {
                System.out.println("Enter " + target + " found at index:" + result);
            }else {
                System.out.println("Element " + target+ " not found in the array.");
            }
            scanner.close();


    }
}
