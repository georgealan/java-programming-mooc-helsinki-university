
import java.util.Scanner;
import java.lang.Math.*;
public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String text = scanner.next();
            if (text.equals("end")) {
                break;
            }

            int number = Integer.parseInt(text);
            int result = (int) Math.pow(number, 3);
            System.out.println(result);
        }
    }
}
