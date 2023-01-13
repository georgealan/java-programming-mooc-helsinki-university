
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        int sum = 0;
        int counter = 0;
        double averageOfTheBirthYears = 0.0;

        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.equals("")) { break; }

            String[] words = phrase.split(",");

            names.add(words[0]);
            sum = sum + Integer.parseInt(words[1]);
            counter++;
        }

        averageOfTheBirthYears = (1.0 * sum / counter);
        String longestName = names.stream()
                        .max(Comparator.comparingInt(String::length)).get();

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageOfTheBirthYears);
    }
}

