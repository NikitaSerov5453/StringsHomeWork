import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {
    /**
     * Задание 5
     * Ввести строку склавиатуры. В строке должны содержаться
     * слова, которые могут быть раздельные пробелами или
     * двоеточиями. Необходимо вычислить количество слов в
     * строке, у которых четное количество букв
     */

    public static void main(String[] args) {
        System.out.println(evenNumberWords(createArrayWords(string)));
    }

    public static String string = scanner().nextLine();

    public static String[] createArrayWords(String s) {
        return s.split("[:\s]");
    }

    public static int evenNumberWords(String[] strings) {
        int counter = 0;
        for (String s : strings) {
            if (s.length() % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
