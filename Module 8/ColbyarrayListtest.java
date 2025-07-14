import java.util.ArrayList;
import java.util.Scanner;

public class ColbyarrayListtest{

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer largest = list.get(0);
        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to finish):");

        while (true) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }

        Integer largest = max(numbers);
        System.out.println("\nThe largest value entered is: " + largest);
    }
}
