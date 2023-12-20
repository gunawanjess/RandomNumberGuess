import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int min = 1; // Minimum value of range
        int max = 100; // Maximum value of range

        // Print the min and max
        System.out.println("Guess an integer from " + min + " to " + max + ":");

        // Generate random int value from min to max
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

        boolean correctGuess = false;

        // Game loop
        while (!correctGuess) {
            try {
                // User input
                int userGuess = scanner.nextInt();

                // Check if the guess is correct, too big, or too small
                if (userGuess == random_int) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    correctGuess = true;
                } else if (userGuess < min || userGuess > max) {
                    System.out.println("Please guess a number within the valid range.");
                } else if (userGuess < random_int) {
                    System.out.println("Too small! Try again:");
                } else {
                    System.out.println("Too big! Try again:");
                }
            } catch (InputMismatchException e) {
                // Handle non-integer input
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Consume the invalid input to avoid an infinite loop
            }
        }

        // Close the scanner
        scanner.close();
    }
}
