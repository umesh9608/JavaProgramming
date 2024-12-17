/* Write a Java program to create a class called "Dog" with a name and breed attribute.
 Create two instances of the "Dog" class, set their attributes using the constructor and
 modify the attributes using the setter methods and print the updated values. */
package OOPS.ClassAndObject;

public class Getter_Setter {
    private String name;
    private String breed;

    public Getter_Setter(String name, String breed){
        this.name = name;  //this keyword is used to refer to the current obj
        this.breed = breed;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public static void main(String[] args) {
        Getter_Setter dog1 = new Getter_Setter("Buddy", "Golden Retriever");
        System.out.println("Dog name: " + dog1.getName() + " And Breed:" + dog1.getBreed());
        dog1.setName("Molly");
        dog1.setBreed("Boxer");
        System.out.println("Update Dog name: " + dog1.getName() + " And Breed:" + dog1.getBreed());
    }
}
