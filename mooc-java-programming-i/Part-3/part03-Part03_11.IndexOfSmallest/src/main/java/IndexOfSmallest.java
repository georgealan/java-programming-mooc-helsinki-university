
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) { break; }
            numbers.add(input);
        }

        printSmallestNumber(numbers);
    }

    static void printSmallestNumber(ArrayList<Integer> list) {
        int minor = list.stream().min(Integer::compare).get();
        System.out.println("Smallest number: " + minor);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == minor) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
