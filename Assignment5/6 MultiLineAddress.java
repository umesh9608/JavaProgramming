package Assignment5;

import java.util.Scanner;

class MultiLineAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multi line Address");
        System.out.print("Please, Enter Street:");
        String street = scanner.nextLine();
        System.out.print("Now, Enter city:");
        String city = scanner.nextLine();
        System.out.print("Now, Enter zip code:");
        String zipCode = scanner.nextLine();
        System.out.print(street + "\n" + city +"\t"+ zipCode);

    }
}
