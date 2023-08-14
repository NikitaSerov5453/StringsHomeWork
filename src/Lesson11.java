import java.util.Objects;
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

    public static void main(String[] args) {//(?<letter>abc){3,}
        b(string);
    }

    public static String string = scanner().next();
    public static String substring;
    public static String pattern = "[d-zD-Z\\d]+";

    public static void b(String s) {
        int lengthSubstring = 1;
        int length = s.length();
        int n;
        int counter = 1;
        String s1;
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(s);
        if (matcher.find()) {
            System.out.println("Не пренадлежит");
            return;
        }
        if (s.contains("bb")) {
            System.out.println("Не пренадлежит");
            return;
        }
        for (int i = 0; i < length; i++) {
            length = s.length() - lengthSubstring + 1;
            for (int j = 0; j < length; j++) {
                n = j;
                s1 = substring;
                substring = s.substring(j, n + lengthSubstring);
                if (Objects.equals(substring, s1)) {
                    counter++;
                } else {
                    counter = 1;
                }
                if (counter == 3) {
                    System.out.println("Не пренадлежит");
                    return;
                }
            }
            lengthSubstring++;
        }
        System.out.println("Пренадлежит");
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

}
