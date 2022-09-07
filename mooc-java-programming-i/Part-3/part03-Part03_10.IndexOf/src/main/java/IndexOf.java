
import java.util.*;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int numberChosen = scanner.nextInt();

        searchForNumbersInTheIndexes(list, numberChosen);
    }

    static void searchForNumbersInTheIndexes(ArrayList<Integer> numbers, int numberChosen) {
        for (int i = 0; i < numbers.size(); i++) {
           if (numbers.get(i) == numberChosen) {
               System.out.println(numbers.get(i) + ": " + i);
           }
        }
    }
}
