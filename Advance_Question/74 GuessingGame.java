package Advance_Question;

import java.util.Scanner;

class GuessingGame {
    int random;

    GuessingGame() {
        random = (int) (Math.random() * 100) + 1;  // Generates random number between 1 and 100
    }

    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the guessing game. Guess the number between 1 and 100.");

        int guess;
        int result;

        do {
            System.out.println("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);

            if (result == 0) {
                System.out.println("Congrats, your guess is correct!");
            } else if (result > 0) {
                System.out.println("Please guess lower.");
            } else {
                System.out.println("Please guess higher.");
            }
        } while (result != 0);

        input.close();  // Close the scanner to prevent resource leak
    }
}
