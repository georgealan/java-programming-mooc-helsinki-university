
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        int resultSum = 0;
        int even = 0;
        int odd = 0;
        List<Integer> numbers = new ArrayList<>();

        while (true){
            System.out.println("Give numbers:");
            int number = scanner.nextInt();

            if (number < 0){
                for (int n : numbers){
                    resultSum += n;

                    if (n % 2 != 0){
                        odd++;
                    } else {
                        even++;
                    }

                }

                System.out.println("Thx! Bye!");
                System.out.println("Sum:" + resultSum);
                System.out.println("Numbers: " + numbers.size());
                System.out.println("Average: " + (double) resultSum / numbers.size());
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }

            numbers.add(number);

        }

    }
}
