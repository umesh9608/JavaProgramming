package Assignment5;

import java.util.Scanner;

class LargeDataTypeToSmallDataType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cast a Larger Data Type to a Smaller Data Type");
        System.out.print("Please Enter the Real No:"); //use 123456
        long num = input.nextLong();

        byte castnum = (byte) num;
        //Note: This type of casting may lead to data loss because byte can only hold values from -128 to 127.
        // If the long value exceeds this range, it will wrap around (e.g., 123456 will not fit into byte, so it will give a wrapped value).

        System.out.println(castnum);
    }
}
