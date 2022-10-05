
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        sum(numbers);
    }

    static int sum(ArrayList<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n)
                .sum();
    }
}
