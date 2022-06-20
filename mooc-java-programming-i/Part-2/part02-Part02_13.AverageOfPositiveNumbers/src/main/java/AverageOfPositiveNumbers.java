
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfPositiveNumbers = 0;
        int sumOfPositiveNumbers = 0;
        double averageOfPositiveNumbers = 0.0;

        while (true) {
            int number = scanner.nextInt();
            List<Integer> numbers = new ArrayList<>();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                numbers.add(number);

                for (int numberSplit : numbers) {
                    amountOfPositiveNumbers++;
                    sumOfPositiveNumbers += numberSplit;
                }
            }
        }

        if (amountOfPositiveNumbers == 0) {
            System.out.println("Cannot calculate the average");
        }

        if (amountOfPositiveNumbers > 0) {
            averageOfPositiveNumbers = (double) sumOfPositiveNumbers / amountOfPositiveNumbers;
            System.out.println(averageOfPositiveNumbers);
        }

    }
}
