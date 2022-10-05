
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int number = scanner.nextInt();
            if (number == -1) { break; }
            list.add(number);
        }

        calculateAverage(list);
    }

    static void calculateAverage(ArrayList<Integer> list) {
        int listLenght = list.size();
        int n = 0;
        double average = 0;

        for (Integer number : list) {
            average = (double) (n += number) / listLenght;
        }

        System.out.println("Average: " + average);
    }

}
