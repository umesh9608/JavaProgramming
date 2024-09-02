/* Calculate Product of Numbers from 1 to 5
Description: Write a Java program that calculates the product of numbers from 1 to 5 using a
while loop.
Hint:
 Initialize a product variable to 1.
 Use a while loop to multiply the product variable by each number from 1 to 5. */
package Assignment4;

 class ProductOfNumber {
    public static void main(String[] args) {
        int product = 1;
        int number = 1;

        while (number <= 5) {
            product *= number;
            number++;
        }
        System.out.println("The product of numbers from 1 to 5 is: " + product);
    }
}
