/* Binary Search is an efficient searching algorithm that works on a sorted array. It repeatedly divides the search
interval in half. If the target value matches the middle element, the search is complete. Otherwise, the search
continues in the left or right half depending on whether the target is smaller or larger than the middle element. */
package AssignmentSearchingAlgorithm;

import java.util.Scanner;

public class BinarySearch {
public static int binarySearch(int[] array, int target){
    int left = 0, right = array.length -1;
    while (left <= right ){
        int mid = left + (right - left) / 2;
        if(array[mid] == target){
            return mid;
        }else if(target < array[mid]) {
            right = mid -1;
        }else {
            left = mid + 1;
        }
    }
    return  -1;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " sorted integer:");
        for(int i=0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the target element to search for:");
        int target = scanner.nextInt();
        int result = binarySearch(array,target);
        if(result != -1){
            System.out.println("Element "+ target + " found at index: " + result);

           }else {
            System.out.println("Element " + target + " not found in the array.");
        }

    }
}
