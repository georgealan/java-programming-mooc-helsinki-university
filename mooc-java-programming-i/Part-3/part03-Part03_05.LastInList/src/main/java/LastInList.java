
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LastInList {

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

        returnLastName(list);

    }

    static void returnLastName(ArrayList<String> names) {
        int lastIndex = names.size() -1;
        String lastName = names.get(lastIndex);

        System.out.println(lastName);
    }
}
