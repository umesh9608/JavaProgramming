/*Write a Java program to create a class called "Rectangle" with width and height attributes.
 Calculate the area and perimeter of the rectangle */
package OOPS.ClassAndObject;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        //return height * width;
        return getHeight() * getWidth();
    }

    public double getPerimeter() {
       // return 2 * height * width;
        return  2 * (getHeight() * getWidth());
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(7, 12);
        System.out.println("The area of the rectangle is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is " + rectangle.getPerimeter());

        rectangle.setWidth(6);
        rectangle.setHeight(12);

        System.out.println("\nThe area of the rectangle is now " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is now " + rectangle.getPerimeter());
    }
}