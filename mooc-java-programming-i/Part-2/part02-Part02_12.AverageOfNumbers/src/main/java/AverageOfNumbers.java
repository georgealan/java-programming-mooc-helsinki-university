
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfNumbers = 0;
        int sumOfNumbers = 0;
        double averageOfNumbers = 0.0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            List<Integer> numbers = new ArrayList<>();

            if (number == 0) {
                break;
            }

            numbers.add(number);

            for (int numberSplited : numbers) {
                amountOfNumbers++;
                sumOfNumbers += numberSplited;
            }
        }

        averageOfNumbers = (double) sumOfNumbers / amountOfNumbers;
        System.out.println("Average of the numbers: " + averageOfNumbers);

    }
}
