
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> ages = new ArrayList<>();

        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.equals("")) {
                break;
            }
            String[] words = phrase.split(",");
            ages.add(Integer.parseInt(words[1]));
        }

        Integer maxAge = ages.stream().max(Integer::compareTo).get();
        System.out.println("Age of the oldest: " + maxAge);
    }
}
