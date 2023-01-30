
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner doc = new Scanner(Paths.get(file))) {
            while (doc.hasNextLine()) {
                words.add(doc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        boolean contains = words.contains(searchedFor);
        if (contains) {
            System.out.println("Found!");
        } else if (!contains) {
            System.out.println("Not found.");
        }
    }
}
