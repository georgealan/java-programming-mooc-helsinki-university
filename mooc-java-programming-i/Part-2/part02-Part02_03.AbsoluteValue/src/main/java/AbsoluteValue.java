
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numer = scanner.nextInt();

        if (numer < 0){
            System.out.println(numer * -1);
        } else {
            System.out.println(numer);
        }

    }
}
