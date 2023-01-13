import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // FIRST SOLUTION - PASS IN MOOC PORTAL
        /*while (true) {
            String text = scanner.nextLine();
            String[] pieces = text.split(" ");
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);

            }
            if(text.equals("")){
                break;
            }
        }*/

        // SECOND SOLUTION - DON'T PASS IN MOOC PORTAL, BUT IS CORRECT TOO.
        String phrase = scanner.nextLine();
        String regex = "\\S+";
        String string = "ski-bi dibby yo da dub\ndib\n\n";
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                words.add(matcher.group());
            }
        }

        String w = String.join(" ", words);
        String[] fw = w.split(" ");

        for (String x : fw) {
            System.out.println(x);
        }
    }
}
