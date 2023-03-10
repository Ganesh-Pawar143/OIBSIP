import java.util.Scanner;

public class Game {
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public int playGame(int range, int randomNumber) {
        int userGuess;
        int guess = 0;

        do {
            System.out.print("Enter your guess number: ");
            userGuess = scanner.nextInt();
            guess++;
            if (userGuess > randomNumber) {
                System.out.println("Lower");
            } else if (userGuess < randomNumber) {
                System.out.println("Higher");
            }
        } while (randomNumber != userGuess);

        System.out.println("Congratulations! You guessed the number in " + guess + " guesses.");
  
        return guess;
    }
}
