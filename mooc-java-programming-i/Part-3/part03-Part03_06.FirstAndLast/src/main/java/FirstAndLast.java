
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        printFirstAndLastNames(list);

    }

    static void printFirstAndLastNames(ArrayList<String> names) {
        int lastIndex = names.size() -1;
        String lastName = names.get(lastIndex);
        String firstName = names.get(0);

        System.out.println(firstName + "\n" + lastName);
    }
}
