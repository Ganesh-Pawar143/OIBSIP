import java.util.ArrayList;
import java.util.Collections;

public class ScoreBoard {
    private ArrayList<Integer> scoreBoard = new ArrayList<>();

    public void add(int guesses) {
        scoreBoard.add(guesses);
    }

    public void displayScoreBoard() {
        System.out.println("--------------------");
        System.out.println("Score Board");
        System.out.println("--------------------");

        if (scoreBoard.isEmpty()) {
            System.out.println("No scores to display");
            return;
        }

        Collections.sort(scoreBoard);

        System.out.println("Your fastest games today out of all tries is: " + scoreBoard.get(0) + "\n");

        for (int score : scoreBoard) {
            System.out.println("Finished the number game in " + score + " tries");
        }

        System.out.println();
    }
}
