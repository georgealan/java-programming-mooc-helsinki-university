
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();
            String[] words = phrase.split(" ");

            System.out.println(words[words.length - 1]);

            if (phrase.equals("")) {
                break;
            }
        }

    }
}
