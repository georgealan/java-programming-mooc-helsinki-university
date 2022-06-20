
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfNumbers = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();

            countOfNumbers++;

            if (number == 0) {
                countOfNumbers -= 1;
                break;
            }
        }

        System.out.println("Number of numbers: " + countOfNumbers);

    }
}
