package OOPS.ClassAndObject;

public class CopyConstructor {

        String name;
        int age;

        // Constructor to initialize name and age
        public CopyConstructor(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Copy constructor
        public CopyConstructor(CopyConstructor other) {
            this.name = other.name;
            this.age = other.age;
        }

        // Method to display student details
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public static void main(String[] args) {
            // Creating the first Student object
            CopyConstructor s1 = new CopyConstructor("John", 20);

            // Creating the second Student object using the copy constructor
            CopyConstructor s2 = new CopyConstructor(s1);

            // Displaying the details of both students
            System.out.println("Original Student:");
            s1.display();

            System.out.println("Copied Student:");
            s2.display();
        }
}
