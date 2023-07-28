import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
    /**
     * Задание 3
     * Подсчитать среднюю длину слова, во введенном с
     * клавиатуры предложении.
     */

    public static void main(String[] args) {
        System.out.println(averageWordLength());

    }
    public static String string = scanner().nextLine();
    public static String[] strings = countNumberWords(string);

    public static String[] countNumberWords(String s) {
        return s.split(" ");
    }

    public static double averageWordLength() {
        int counter = 0;
        for (String s : strings) {
            counter += s.length();
        }

        return (double) counter / strings.length;
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
