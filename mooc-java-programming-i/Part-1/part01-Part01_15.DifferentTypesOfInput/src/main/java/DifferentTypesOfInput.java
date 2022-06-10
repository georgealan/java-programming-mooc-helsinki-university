
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String textString = scan.nextLine();
        System.out.println("Give an integer:");
        int number = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double floatDecimalNumber = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean isThatReallyTrue = scan.nextBoolean();
        System.out.println("You gave the string " + textString);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + floatDecimalNumber);
        System.out.println("You gave the boolean " + isThatReallyTrue);

    }
}
