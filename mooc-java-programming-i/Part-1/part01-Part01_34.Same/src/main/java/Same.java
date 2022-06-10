
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String firstSentence = scan.nextLine();
        System.out.println("Enter the first string:");
        String secondSentence = scan.nextLine();

        boolean sentenceAreEquals = firstSentence.equals(secondSentence);

        if (sentenceAreEquals) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}
