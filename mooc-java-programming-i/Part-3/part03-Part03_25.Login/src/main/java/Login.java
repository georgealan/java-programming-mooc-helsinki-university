
import java.util.*;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        users.put("sunshine", "alex");
        users.put("haskell", "emma");

        System.out.println("Enter username:");
        String userName = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (users.containsValue(userName) && users.containsKey(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
