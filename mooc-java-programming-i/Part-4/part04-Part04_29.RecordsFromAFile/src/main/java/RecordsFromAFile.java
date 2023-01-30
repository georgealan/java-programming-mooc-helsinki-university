
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearDate = "";

        System.out.println("Name of the file:");
        String filePath = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(filePath))) {
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] parts = line.split(",");
                if (parts[1].equals("1")) {
                    yearDate = "year";
                } else {
                    yearDate = "years";
                }
                System.out.println(parts[0] + ", age: " + parts[1] + " " + yearDate);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
