package OOPS.ClassAndObject;

public class Constructor {
    public static void main(String[] args) {
        Student_ s1 = new Student_("boka"); //parameter constructor call
        System.out.println(s1.name);
        Student_ s2 = new Student_();//no para call
        //copy constructor
        Student_ s3 = new Student_();
        s3.name ="hrami";
        s3.roll = 121;
        s3.password = "abc";
        Student_ s4 = new Student_(s3); //copy to s3 value in s4
    }
}

class Student_{
    String name;
    int roll;
    String password;
    Student_(String name){ //this is parametrize constructor
        this.name =name; //read note
        System.out.println("Parametrize constructor");
    }

    Student_(){
        System.out.println("None parametrize constructor");
    }
    //copy constructor
    Student_(Student_ s3){
        this.roll = s3.roll;
        this.name = s3.name;
    }
}
/*constructor is a special method which is invoked automatically at the time of object creation
* constructor have the same name as class or structure
* constructor don't have a return type(not even void)
* constructor are only called once, at object creation
* memory allocation happens when constructor is called
* note ager hm constructor nhi bnate hai to java autometic bna deta hai bt jb hme value initilase krna hota hai to hme khud se bnana pdta hai
* constructor me hme polymorphism dekhne ko milta hai jaise constructor overloading*/