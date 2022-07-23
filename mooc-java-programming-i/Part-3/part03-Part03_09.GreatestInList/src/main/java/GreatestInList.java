
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement finding the greatest number in the list here
        printTheGreatestValue(list);
    }

    static void printTheGreatestValue(ArrayList<Integer> numbers) {
        int compare = 0;

        for (Integer number : numbers) {
            compare = max(compare, number);
        }

        System.out.println(compare);
    }
}
