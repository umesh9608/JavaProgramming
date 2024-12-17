package OOPS.ClassAndObject.Question;

public class Student {

    String name;
    int marks;

    public static void main(String[] args) {
        // Creating an instance of Student
        Student s = new Student();

        // The following is NOT valid in Java:
        // s->name = "aman"; // (This is C++ syntax, not Java)

        // The following would be used if 'name' was a static member:
        // Student.name = "aman"; // (This is only valid if 'name' was static)

        // This is correct in Java, assigning a value to the instance variable 'name':
        s.name = "aman";
        System.out.println(s.name); // Output: aman
    }
}
