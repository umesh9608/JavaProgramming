//1: Calculate the Area of a Circle
//Description:
//Write a Java program with a method named calculateArea that takes a single parameter,
//the radius of a circle (a double), and returns the area of the circle. The program should
//prompt the user to input the radius, call the method, and then print the calculated area.
//Concepts Covered:
// Creating methods
// Using method parameters
// Returning values from a method
package Assignment9;
import java.util.Scanner;
class AreaOfACircle {
  public static void calculateArea(double radius){
   double area = 3.14 *radius *radius;
   System.out.println(area);
  }

  public static void main(String[] args) {

   calculateArea(4);

  }
}
