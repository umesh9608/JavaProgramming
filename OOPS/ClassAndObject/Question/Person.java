/* Which variable can the class Person access in the following code
 a.  name       //true
 b.  weight     //true
 c.  rollNumber  //false
 d. schoolName   //false   */

//Note : in java no contain private and protected class because we can't create obj and access
package OOPS.ClassAndObject.Question;
public class Person {
    String name;
    int weight;
}

// Derived class Student, extending Person (not public)
class Student1 extends Person {
    int rollNumber;
    String schoolName;
}

/*
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student1 s = new Student1();

        // Assigning values to the inherited and own fields of the Student
        s.name = "Aman";
        s.weight = 60;
        s.rollNumber = 101;
        s.schoolName = "ABC School";

        // Printing values to verify
        System.out.println("Name: " + s.name);
        System.out.println("Weight: " + s.weight + " kg");
        System.out.println("Roll Number: " + s.rollNumber);
        System.out.println("School Name: " + s.schoolName);
    }

 Question 4
 Which of the following is a correct staement?
 class Vehicle()
 class Car extends Vehicle()

 a.  Car c = new Car();  true
 b.  Vehicle v = ew Vehicle();  true
 c.  Vehicle v = new Car();   true
 d.  Car c = new Vehicle();   false
 */
