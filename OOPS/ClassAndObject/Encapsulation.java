package OOPS.ClassAndObject;

public class Encapsulation {
    // Private variables
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Corrected the class name from Person to Encapsulation
        Encapsulation person = new Encapsulation();

        // Setting values using setters
        person.setName("John");
        person.setAge(30);

        // Using getters to retrieve and print the values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}


/*Encapsulation is defined as the wrapping up of data & method under a single unit. it also implements data hiding */
