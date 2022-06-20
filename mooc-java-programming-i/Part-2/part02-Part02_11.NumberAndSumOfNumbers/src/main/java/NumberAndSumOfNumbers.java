
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int sumOfTheNumbers = 0;

        while (true) {
            System.out.println("Give a number:");

            int number = scanner.nextInt();
            List<Integer> numbers = new ArrayList<Integer>();

            if (number == 0){
                break;
            }

            numbers.add(number);

            for (int numberSplited : numbers) {
                numberOfNumbers++;
                sumOfTheNumbers += numberSplited;
            }
        }

        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfTheNumbers);
    }
}
