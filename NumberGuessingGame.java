import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuessingGame {
    private Menu menu;
    private NumberGenerator numberGenerator;
    private Game game;
    private ScoreBoard scoreBoard;

    public NumberGuessingGame() {
        this.menu = new Menu();
        this.numberGenerator = new NumberGenerator();
        this.game = new Game();
        this.scoreBoard = new ScoreBoard();
    }

    public void run() {
        while (true) {
            int menuOption = menu.displayMenu();

            switch (menuOption) {
                case 1:
                    int numberRange = menu.getRange();
                    int randomNumber = numberGenerator.generateNumber(numberRange);
                    int guesses = game.playGame(numberRange, randomNumber);
                    scoreBoard.add(guesses);
                    break;
                case 2:
                    scoreBoard.displayScoreBoard();
                    break;
                case 3:
                    System.out.println("\nThanks for playing the game!");
                    return;
                default:
                    System.err.println("\nInvalid number entry. Could you please try again later.\n");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.run();
    }
}
