
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int twenthFourHours = 86400;
        System.out.println("How many days would you like to convert to seconds?");
        int numberDays = scanner.nextInt();

        int result = numberDays * twenthFourHours;
        System.out.println(result);

    }
}
