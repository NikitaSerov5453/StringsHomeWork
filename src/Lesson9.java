import java.util.Arrays;
import java.util.Scanner;

public class Lesson9 {
    /**
     * Задание 9
     * Написать программу, проверяющую является ли одна
     * строка анаграммой для другой строки (строка может состоять
     * из нескольких слов и символов пунктуации). Пробелы и
     * пунктуация должны игнорироваться при анализе.
     * Разница в больших и маленьких буквах должна игнорироваться. Обе
     * строки должны вводиться с клавиатуры. Программа должна
     * выводить Yes, если строки являются анаграммой, и No –
     * иначе.
     * Пример анаграммы в стихах:
     * Строка 1 "Аз есмь строка, живу я, мерой остр"
     * Строка 2 "За семь морей ростка я вижу рост"
     */

    public static void main(String[] args) {
        anagramCheck(string1, string2);
    }

    public static String string1 = scanner().nextLine();
    public static String string2 = scanner().nextLine();

    public static void anagramCheck(String string1, String string2) {
        string1 = replaceAllPunctuationMarks(string1);
        string2 = replaceAllPunctuationMarks(string2);
        string1 = stringToLowerCase(string1);
        string2 = stringToLowerCase(string2);
        string1 = sortString(string1);
        string2 = sortString(string2);
        if (string1.equals(string2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static String replaceAllPunctuationMarks(String s) {
        return s.replaceAll("(?U)[\\pP\s]", "");
    }

    public static String stringToLowerCase(String s) {
        return s.substring(0).toLowerCase();
    }

    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
