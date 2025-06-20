import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Enter your choice: (1 = Rock, 2 = Paper, 3 = Scissors)");

        int computerChoice = random.nextInt(3) + 1;

        int userChoice = scanner.nextInt();

        System.out.println("You chose: " + getChoiceName(userChoice));
        System.out.println("Computer chose: " + getChoiceName(computerChoice));

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) || 
                   (userChoice == 2 && computerChoice == 1) || 
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }

    private static String getChoiceName(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Invalid";
        };
    }
}