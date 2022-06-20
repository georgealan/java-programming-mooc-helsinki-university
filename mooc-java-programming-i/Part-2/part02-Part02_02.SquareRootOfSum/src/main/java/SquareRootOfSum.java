
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        int squareRoot = (int) sqrt(sum);

        System.out.println(squareRoot);

    }
}
