//Problem 1: Method Overloading for Calculating Areas
//Description:
//Write a Java program that includes overloaded methods named calculateArea to compute
//the area of different geometric shapes: a circle, a rectangle, and a triangle. The program
//should include:
// calculateArea(double radius) to calculate the area of a circle.
// calculateArea(double length, double width) to calculate the area of a
//rectangle.
// calculateArea(double base, double height) to calculate the area of a triangle.
//The program should prompt the user to choose the shape and input the relevant dimensions,
//then call the appropriate overloaded method and print the area.
//Concepts Covered:
// Method overloading
// Using method parameters with different signatures
package Assignment10;
import java.util.Scanner;
class CalculatingArea {
    public static void calculateArea(double radius) {
        // Scanner input = new Scanner(System.in);
        double area = 3.14 * radius * radius;
        System.out.println("Area Of Circle is" + area);
    }

    public static void calculateArea(double length, double width) {
        double rectangleArea = length * width;
        System.out.println("Area of Rectangle is:" + rectangleArea);
    }

    public static void calculateArea(double base, float height) {
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of Triangle is: " + triangleArea);
    }

    public static void main(String[] args) {
//        calculateArea(4);
//        calculateArea(4, 5);
//       calculateArea(5, 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                calculateArea(radius);
                break;
            case 2: // Rectangle
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                calculateArea(length, width);
                break;
            case 3: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                float height = scanner.nextFloat();
                calculateArea(base, height);
                break;
            default:
                System.out.println("Invalid choice! Please choose a valid shape.");
        }
    }
}

