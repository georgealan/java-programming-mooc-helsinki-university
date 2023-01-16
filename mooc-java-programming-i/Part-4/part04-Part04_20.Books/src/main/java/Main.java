import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) { break; }

            System.out.println("Pages:");
            String pages = scanner.nextLine();

            System.out.println("Publication year:");
            String publicationYear = scanner.nextLine();

            books.add(new Book(title, Integer.parseInt(pages), Year.parse(publicationYear)));
        }

        System.out.println("What information will be printed?");
        String information = scanner.nextLine();
        switch (information) {
            case "name":
                books.stream().forEach(book -> System.out.println(book.getTitle()));
                break;
            case "everything":
                books.stream().forEach(System.out::println);
                break;
        }
    }
}
