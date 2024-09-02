//  Calculate Product of Numbers from 1 to 5
//Description: Write a Java program that calculates the product of numbers from 1 to 5 using a
//while loop.
package Assignment3;

 class CalculateProductOfNumbers {
    public static void main(String[] args) {


        int i = 1;
        int product = 1;

        while ( i < 5){
            product *= i;
            i++;
        }
        System.out.println("the product of 1 to 5 is:" +product);
    }
}
