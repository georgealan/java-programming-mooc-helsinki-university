
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        findWord(list);
    }

    static void findWord(ArrayList<String> list) {
        System.out.println("Search for?");
        String word = scanner.nextLine();

        if (list.contains(word)) {
            System.out.println(word + " was found!");
        } else {
            System.out.println(word + " was not found!");
        }
    }
}
