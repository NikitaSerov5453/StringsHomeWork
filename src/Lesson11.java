import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson11 {
    /**
     * Задание 11
     * |Слова в языке Мумба-Юмба могут состоять только из букв a, b, c, и при этом:
     * |■ никогда не содержат двух букв b подряд;
     * |■ ни в одном слове никогда не встречается три одинаковых подслова подряд.
     * |Например, по этому правилу, в язык
     * |Мумба-Юмба не могут входить слова
     * |aaa (так как три раза подряд содержит подслово a),
     * |ababab (так как три раза подряд содержит подслово ab),
     * |aabcabcabca (три раза подряд содержит подслово abc).
     * |Все слова, удовлетворяющие вышеописанным правилам,
     * |входят в язык Мумба-Юмба.
     *  Напишите программу, которая по данному слову (введеного с клавиатуры) определит, принадлежит ли оно этому языку.
     */

    public static void main(String[] args) {
        wordMatching(string);
    }

    public static String string = scanner().next();
    public static String substring;
    public static String pattern = "[^a-cA-C]+";//
    public static String prefix = "(?<letter>";
    public static String postfix = "){3,}";

    public static void wordMatching(String s) {
        int lengthSubstring = 1;
        int length = s.length();
        int n;
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(s);
        if (!matcher.find()) {
            if (s.contains("bb")) {
                System.out.println("Не пренадлежит");
                return;
            }

            for (int i = 0; i < length; i++) {
                length = s.length() - lengthSubstring + 1;
                for (int j = 0; j < length; j++) {
                    n = j;
                    substring = s.substring(j, n + lengthSubstring);
                    if (checkingRepetitionSubstrings(substring, s)) {
                        System.out.println("Не пренадлежит");
                        return;
                    }
                }
                lengthSubstring++;
            }
            System.out.println("Пренадлежит");

        } else {
            System.out.println("Не пренадлежит");
        }
    }

    public static boolean checkingRepetitionSubstrings(String pattern, String string) {
        Pattern pattern1 = Pattern.compile(prefix + pattern + postfix);
        Matcher matcher = pattern1.matcher(string);
        return matcher.find();
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

}
