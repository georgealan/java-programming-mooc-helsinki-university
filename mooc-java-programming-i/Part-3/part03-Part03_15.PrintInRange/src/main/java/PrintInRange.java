
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();

        printNumbersInRange(list, lower, upper);
    }


    static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range [" + lowerLimit + ", " + upperLimit + "]");

        for (Integer number : numbers) {
            if (number > lowerLimit && number < upperLimit) {
                System.out.println(number);
            }
        }
    }
}
