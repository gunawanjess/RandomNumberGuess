import java.util.InputMismatchException;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int min = 1; // Minimum value of range
        int max = 100; // Maximum value of range
        int maxAttempt = 7; // Maximum number of attempts

        boolean playAgain = true;

        // Main game loop
        while (playAgain) {
            // Print the min and max
            System.out.println("Guess an integer from " + min + " to " + max + ":");

            // Generate random int value from min to max
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

            boolean correctGuess = false;
            int attempt = 0;

            // Guessing loop
            while (attempt < maxAttempt) {
                try {
                    // User input
                    int userGuess = scanner.nextInt();
                    attempt++;

                    // Check if the guess is correct, too big, or too small
                    if (userGuess == random_int) {
                        System.out.println("Congratulations! You guessed the correct number.");
                        correctGuess = true;
                        break; // Exit the guessing loop
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

            if (!correctGuess) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + random_int);
            }

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (Type 'y' to play again)");
            String contChoice = scanner.next().toLowerCase();

            // Continue playing if the user types 'y'
            playAgain = contChoice.equals("y");
        }
        // Programmer name
        System.out.println("Program by Jess Gunawan");
        // Close the scanner
        scanner.close();
    }
}
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
                    System.out.println("Please guess a number from " + min + " to " + max + ".");
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
