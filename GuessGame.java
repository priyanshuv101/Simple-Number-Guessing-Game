import java.util.Scanner;
import java.util.Random;

class GuessGame
 {
    public static void main(String[] args) 
{
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int number = rand.nextInt(10) + 1; // Random number between 1 and 10
        int guess;
        int attempts = 0;
        int maxAttempts = 4;

        System.out.println(" Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 10");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        boolean guessedCorrectly = false;

        while (attempts < maxAttempts)
 {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess == number)
 {
                System.out.println(" Correct! You guessed the number in " + attempts + " attempt(s).");
                guessedCorrectly = true;
                break;
            } 
else if (guess < number) 
{
                System.out.println("Too low!\n");
            }
 else 
{
                System.out.println("Too high!\n");
            }
        }

        // If user didn't guess correctly
        if (!guessedCorrectly)
 {
            System.out.println(" Sorry! You've used all attempts.");
            System.out.println("The correct number was: " + number);
        }

        input.close();
    }
}