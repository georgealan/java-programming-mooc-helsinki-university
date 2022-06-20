
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.sum;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfTheNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            List<Integer> numbers = new ArrayList<Integer>();

            if (number == 0) {
                break;
            }

            numbers.add(number);

            for (int numberSum : numbers){
                sumOfTheNumbers += numberSum;
            }
        }

        System.out.println("Sum of the numbers: " + sumOfTheNumbers);

    }
}
