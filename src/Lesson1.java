import java.util.Scanner;

public class Lesson1 {
    /**
     * Задание 1
     * Ввести с клавиатуры строку текста, а затем один символ.
     * Показать на консоль индексы и количество совпадений (ищем
     * вхождения символа в строку). В случае если совпадений не
     * найдено, вывести соответствующий текст.
     */

    public static void main(String[] args) {
        searchIndex(string, searchSymbol);
    }

    public static String string = scanner().next();
    public static char searchSymbol = scanner().next().charAt(0);

    public static void searchIndex(String s, char searchSymbol) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == searchSymbol) {
                System.out.println("Индекс: " + i);
                counter++;
            }
        }
        if (counter != 0) {
            System.out.println("Колличество совпадений: " + counter);
        } else {
            System.out.println("Данного символа нет в строке.");
        }
    }
    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
