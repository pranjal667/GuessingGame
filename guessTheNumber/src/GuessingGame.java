import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int numAttempts = 0;
        
        System.out.println("Guess a number between 1 and 100. You have 10 tries.");

        while (numAttempts < 10) {
            numAttempts++;
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("You win!");
                System.out.println("The secret number was " + secretNumber);
                System.out.println("You used " + numAttempts + " attempts to guess the secret number.");
                System.out.println("Your score is " + (100 - (numAttempts * 10)) + " out of 100.");
                scanner.close();
                return;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low. Turns left: " + (10 - numAttempts));
            } else {
                System.out.println("Your guess is too high. Turns left: " + (10 - numAttempts));
            }
        }

        System.out.println("You lose. The secret number was " + secretNumber + ".");
        scanner.close();
    }
}
