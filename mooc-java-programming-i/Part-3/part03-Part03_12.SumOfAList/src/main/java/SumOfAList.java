
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfAList {

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

        printSumOfTheNumbersStreamApproach(list);
    }

    static void printSumOfTheNumbersStreamApproach(ArrayList<Integer> list) {
       int sum = list.stream()
               .mapToInt(i -> i)
               .sum();

        System.out.println("Sum: " + sum);
    }

    static void printSumOfTheNumbersForEachApproach(ArrayList<Integer> list) {
        int sum = 0;

        for (int number : list) { sum += number; }

        System.out.println("Sum: " + sum);
    }

}
