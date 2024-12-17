package OOPS.ClassAndObject;

public class Class {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
     // p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username= "Umesh";
      //myAcc.password = "aaaa"; //this in not accessible bcz private
        myAcc.setPassword("aaaaa"); //this is accessible
        System.out.println("Username: " + myAcc.username);


    }
}

class BankAccount {
    //Access Modifiers  private,default,protected,public
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }


}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Std {
    String name;
    int age;
    float percentage; //cgpa
}


