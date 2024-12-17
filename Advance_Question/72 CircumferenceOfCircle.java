//Calculate the area and circumference of a circle for a given radius using Math.PI
package Advance_Question;

import java.util.Scanner;

class CircumferenceOfCircle {
     double radius;

     CircumferenceOfCircle(double radius){
         this.radius = radius;
     }

     double getCircumference(){
       return  2 * radius *Math.PI;
     }

     double getArea(){
         return Math.PI* Math.pow(radius,2);
     }

     @Override
     public String toString() {
         return "Circle Props: Radius in mm: " + radius
                 + ",Circumference in mn: " +getCircumference()
                 + ", Area in mm2:" + getArea();
     }

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to the Circle World");
         System.out.print("Please enter your radius: ");
         double radius = input.nextDouble();
         CircumferenceOfCircle circle = new CircumferenceOfCircle(radius);
         System.out.println(circle);
     }
}
