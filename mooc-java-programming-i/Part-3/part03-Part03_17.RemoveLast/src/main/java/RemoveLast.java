
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        removeLast(strings);
    }

    static void removeLast(ArrayList<String> strings) {
        try {
            strings.remove(strings.size() - 1);
        } catch (Exception e) { }

    }
}
