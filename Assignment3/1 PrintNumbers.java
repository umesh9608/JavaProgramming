//1) Print Numbers from 0 to 10 and 10 to 0 Using Two While Loops
//Description: Write a Java program that prints numbers from 0 to 10 using one while loop
//and then prints numbers from 10 to 0 using another while loop
package Assignment3;

 class PrintNumbers {
    public static void main(String[] args) {

        int i = 0;
        System.out.println("Print 10 to 0 :");
        while ( i < 11){
            System.out.println(i);
            i++;
        }
        //second
        int num = 10;
        System.out.println("print 0 to 10 :");
        while ( num >= 0) {
            System.out.println(num);
            num--;

        }

    }
}
