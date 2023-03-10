import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public int displayMenu() {
        System.out.println("--------------------");
        System.out.println("Welcome to the number game");
        System.out.println("1) Play the Game");
        System.out.println("2) Score Board");
        System.out.println("3) Exit the game");
        System.out.println("--------------------");
        System.out.print("What action would you like to do from the above actions? ");

        return scanner.nextInt();
    }

    public int getRange() {
        System.out.print("\n" + "What would you like the range of the numbers to be? ");

        return scanner.nextInt();
    }
}
