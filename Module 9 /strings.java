import java.util.ArrayList;
import java.util.Scanner;

public class strings {

    public static void main(String[] args) {
        ArrayList<String> phrases = new ArrayList<>();

        phrases.add("Red");
        phrases.add("Blue");
        phrases.add("Green");
        phrases.add("Yellow");
        phrases.add("Orange");
        phrases.add("Purple");
        phrases.add("Pink");
        phrases.add("Black");
        phrases.add("White");
        phrases.add("Gray");

        System.out.println("Here are your words:");
        for (String word : phrases) {
            System.out.println(word);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index (0–9) of the word you want to see again: ");
        String input = scanner.nextLine();

        try {

            int index = Integer.parseInt(input);
            String selectedWord = phrases.get(index);
            System.out.println("You selected: " + selectedWord);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }
    }
}
