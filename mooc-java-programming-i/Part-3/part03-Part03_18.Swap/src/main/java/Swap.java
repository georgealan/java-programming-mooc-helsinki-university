
import java.util.Scanner;

public class Swap {
    static int[] array = new int[5];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");
        System.out.println("Give two indices to swap:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        swapingValuesFromIndices(number1, number2);

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

    static void swapingValuesFromIndices(int n1, int n2) {
        int helper = array[n1];
        array[n1] = array[n2];
        array[n2] = helper;
    }

}
