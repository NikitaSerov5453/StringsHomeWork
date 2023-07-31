import java.util.ArrayList;
import java.util.Scanner;

public class lesson4 {
    /**
     * Задание 4
     * Ввести строку с клавиатуры (латиницей). Из введенной
     * строки выбрать все слова, начинающиеся на гласные буквы
     * и заканчивающиеся на согласные. Вывести отобранные
     * слова на консоль.
     */

    public static void main(String[] args) {
        searchWords(createArrayWords(string));
        System.out.println(newStrings);
        deleteUnnecessaryWords(newStrings);
        System.out.println(newStrings2);
    }

    public static char[] vowelLetters = new char[]{'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'};
    public static char[] consonantLetters = new char[]{'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q',
            'R', 'S', 'T', 'V', 'W', 'X', 'Z',
            'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
    public static String string = scanner().nextLine();
    public static ArrayList<String> newStrings = new ArrayList<>();
    public static ArrayList<String> newStrings2 = new ArrayList<>();
    public static String[] createArrayWords(String s) {
        return s.split(" ");
    }

    public static void searchWords(String[] strings) {
        for (String s : strings) {
            for (char vowelLetter : vowelLetters) {
                if (s.charAt(0) == vowelLetter) {
                    newStrings.add(s);
                }
            }
        }
    }

    public static void deleteUnnecessaryWords(ArrayList<String> strings) {
        for (String s : strings) {
            for (char consonantLetter : consonantLetters) {
                if (s.charAt(s.length() - 1) == consonantLetter) {
                    newStrings2.add(s);
                    break;
                }
            }
        }
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

}
