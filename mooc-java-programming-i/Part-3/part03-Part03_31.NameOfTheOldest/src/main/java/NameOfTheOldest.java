
import java.util.*;
import java.util.stream.Collectors;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> persons = new HashMap<>();

        while (true) {
            String phrase = scanner.nextLine();
            if (phrase.equals("")) { break; }

            String[] words = phrase.split(",");

            persons.put(words[0], Integer.parseInt(words[1]));
        }

        int maxAge = Collections.max(persons.values());
        String oldestPerson = persons.entrySet().stream()
                .filter(entry -> entry.getValue() == maxAge)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());

        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
