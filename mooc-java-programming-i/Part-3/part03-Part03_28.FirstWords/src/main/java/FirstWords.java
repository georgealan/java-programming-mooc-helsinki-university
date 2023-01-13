
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();
            String[] words = phrase.split(" ");

            System.out.println(words[0]);

            if (phrase.equals("")) {
                break;
            }
        }

    }
}
