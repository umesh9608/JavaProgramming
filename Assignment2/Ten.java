package Assignment2;

import java.util.Scanner;

// Write a C program to determine eligibility for admission to a professional
//course based on the following criteria:
// Marks in Maths ≥ 65, Marks in Physics ≥ 55, and Marks in Chemistry ≥ 50
// Total marks in all three subjects ≥ 190 or total marks in Maths and Physics ≥ 140
public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Marks of Math: ");
        int math = scanner.nextInt();

        System.out.print("Enter the Marks of phy: ");
        int phy = scanner.nextInt();

        System.out.print("Enter the Marks of che: ");
        int che = scanner.nextInt();

        int total = math+phy+che;
        System.out.println("total marks of math,che,phy :" +total);

      if(math >= 65 && phy >= 55 &&  che >= 50 ){
          System.out.println("The candidate is eligible for admission");
      }else {
          System.out.println("The candidate is not eligible for admission");
      }
    }
}
