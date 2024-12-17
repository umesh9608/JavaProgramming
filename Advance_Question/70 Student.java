/*
Define a Student class with fields like name and age, and use toString to student details
 */
package Advance_Question;

 class Student {
         String name;
         int age;
         String rollNo;
         String house;

     public Student(String name, int age, String rollNo, String house) {
         this.name = name;
         this.age = age;
         this.rollNo = rollNo;
         this.house = house;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", rollNo='" + rollNo + '\'' +
                 ", house='" + house + '\'' +
                 '}';
     }

     public static void main(String[] args) {
         Student stu = new Student("umesh",39,"002","ranchi");
         System.out.println(stu);
     }
 }
