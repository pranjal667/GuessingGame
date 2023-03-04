import java.util.Scanner;
import java.util.Random;

public class PreviousVersion {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int secretNumber = randomNumberGenerator.nextInt(100);
        int numTurns = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Guess a number between 1 to 100. You will have 10 turns!");

        int guess;
        int numWrongGuesses = 0;
        boolean win = false;
        
        while(!win) {
            guess = scanner.nextInt();
            numTurns++;
                
            if(guess == secretNumber) {
                win = true;
                scanner.close();
            }
            else if(numWrongGuesses > 8) {
                System.out.println("You lose! The secret number was: " + secretNumber);
                return;
            }

            else if(guess < secretNumber){
                numWrongGuesses++;
                System.out.println("Your guess is lower than the secret number! Turns left: " + (10 - numWrongGuesses));
            }

            else if(guess > secretNumber) {
                numWrongGuesses++;
                System.out.println("Your guess is higher than the secret number! Turns left: " + (10 - numWrongGuesses));
            }
        }

        System.out.println("You win!");
        System.out.println("The secret number was: " + secretNumber);
        System.out.println("You used " + numTurns + " turns to guess the secret number");
        System.out.println("Your score is " + ((11-numTurns)*10) + " out of 100");
    }
}
