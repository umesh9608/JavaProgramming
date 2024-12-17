/* Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.*/
package OOPS.ClassAndObject;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


    public static void main(String[] args) {
        Person person1 = new Person("umesh", 11);
      // Person person2 = new Person("rahul",15);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");

        //modify data
        person1.setName("umesh kumar");
        person1.setAge(14);
        System.out.println("Set new name:");
        System.out.println(person1.getName()+ " is now " + person1.getAge() + " years old");
    }
}

/*  Getter Method (get):
 The getter method retrieves the value of a private or protected field.
 It allows read-only access to the class’s data members.
 By using getter methods, you provide controlled access to the data, ensuring that the internal state of the object is not exposed directly to the outside world.

Setter Method (set):
  The setter method allows you to modify the value of a private or protected field.
  It provides controlled write access to the data. You can validate or manipulate the data before assigning it to the class’s internal state.
  By using setter methods, you can protect the integrity of the object's state by enforcing constraints or conditions
*/