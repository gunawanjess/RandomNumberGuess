import random

def random-number-guess():
    min_value = 1
    max_value = 100
    max_attempts = 7

    play_again = True

    while play_again:
        # Print the min and max
        print(f"Guess an integer from {min_value} to {max_value}:")

        # Generate random int value from min to max
        random_int = random.randint(min_value, max_value)

        correct_guess = False
        attempt = 0

        # Guessing loop
        while attempt < max_attempts:
            try:
                # User input
                user_guess = int(input())
                attempt += 1

                # Check if the guess is correct, too big, or too small
                if user_guess == random_int:
                    print("Congratulations! You guessed the correct number.")
                    correct_guess = True
                    break  # Exit the guessing loop
                elif user_guess < min_value or user_guess > max_value:
                    print(f"Please guess a number from {min_value} to {max_value}.")
                elif user_guess < random_int:
                    print("Too small! Try again:")
                else:
                    print("Too big! Try again:")

            except ValueError:
                # Handle non-integer input
                print("Invalid input. Please enter a valid integer.")

        if not correct_guess:
            print(f"Sorry, you've reached the maximum number of attempts. The correct number was: {random_int}")

        # Ask if the user wants to play again
        continue_choice = input("Do you want to play again? (Type 'y' to play again): ").lower()

        # Continue playing if the user types 'yes'
        play_again = continue_choice == "y"

if __name__ == "__main__":
    random-number-guess()
