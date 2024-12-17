package Basic.String;

public class StringFormat {
    public static void main(String[] args) {
        String name= "sandeep";
        int marks=45;
        System.out.println("Hello "+ name +", your marks are:" + marks);
        System.out.printf("Hello %s, your marks are: %d", name, marks);
        System.out.println();
//Capital format
        System.out.printf("Hello %S, your marks are: %d", name, marks);
        System.out.println();
        System.out.printf("%20s",name);
        System.out.println();
        System.out.printf("%-20s",name);
        System.out.println();
        int mark= 3393999;
        System.out.printf("%0,5d",mark);
        //"%d" , %15d", "%+15d", "%-+15d", "%0,15d can use
    }
}
/*
Immutability:Once created, a String object's value cannot be changed.
Modification create new String object.
String Pool:java maintains a pool of string for efficiency, When a new string is created, it's checked against the pool for a match to reuse.
Comparing:equals() method for value comparison,== operator checks reference equality.
eg:
String str1="abc";
String str2 = "abc";
String str3= newString("abc");

str1 == str2; //true
str1 == str3;  //false
 */