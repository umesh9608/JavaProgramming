/*  Find Maximum of Three Numbers
Description: Write a Java program to find the maximum of three numbers entered by the
user.  */
package Assignment1;

 class MaxThreeNumber {

        public static void main(String[] args) {
            int a=10;
            int b=20;
            int c=30;
            int max = a;

            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }

            // Displaying the maximum number
            System.out.println("The maximum of the three numbers is: " + max);


        }
        }

