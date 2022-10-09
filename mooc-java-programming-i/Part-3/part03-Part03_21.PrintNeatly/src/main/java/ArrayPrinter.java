import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int lastIndex = array.length - 1;

        for (int i = 0; i < lastIndex; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[lastIndex]);
    }
}
