//Write a Java program with a method named findMaximum that takes three integer parameters
//and returns the largest of the three numbers. The program should prompt the user to input
//three numbers, call the method, and print the maximum number.
//Concepts Covered:
// Creating methods with multiple parameters
// Using if-else statements to compare values
// Returning values from a method
package Assignment9;
class MaxOfThreeNumber {
    public static void findMaximum(int num1,int num2, int num3){
           if (num1 > num2 && num1 > num3) {
               System.out.println("Num1 ia largest");
           } else if (num2 > num1 && num2 > num3) {
               System.out.println("Num2 is largest");
           } else if (num3 > num1 && num3 > num2) {
               System.out.println("Num3 is largest");
           }
    }
    public static void main(String[] args) {
        findMaximum(53 ,53,8);
    }

}
