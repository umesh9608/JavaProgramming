package MathClass;

import OOPS.ClassAndObject.car;

public class StringMethod {
    int noOfWheels;
    int noOfDoor;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public StringMethod(int noOfWheels, int noOfDoor, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoor = noOfDoor;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }
//    public String toString(){
//        return "My car name is:" + name;
//    }


    @Override
    public String toString() {
        return "StringMethod{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoor=" + noOfDoor +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StringMethod swift = new StringMethod(4,4,120,"swift","SW896","tesla");
        System.out.println(swift.toString());
    }
}
/*Function: toString() provides a string representation of an object.
Inheritance: it's inherited form the object class
Default Format: By default, return class name, "@", and hashcode
Overriding: Commonly overriding in custom class for meaningful output
Implicit Call: Automatically called in string concatenation.
 */