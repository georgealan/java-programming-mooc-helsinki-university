import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");
        String path = scanner.nextLine();
        System.out.println(path);

        try (Scanner file = new Scanner(Paths.get(path))) {
            while (file.hasNextLine()) {
                String row = file.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
