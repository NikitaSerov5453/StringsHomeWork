import java.util.Scanner;

public class Lesson10 {
    /**
     * Задание 10
     * Напишите программу, которая будет печатать
     * ромбовидный рисунок на основе строки, введенной с
     * клавиатуры (максимальная длина – 50 символов).
     * Пример вывода для строки testing:
     *       t
     *      te
     *     tes
     *    test
     *   testi
     *  testin
     * testing
     * esting
     * sting
     * ting
     * ing
     * ng
     * g
     */

    public static void main(String[] args) {
        printRhombus(string);
    }

    public static String string = scanner().next();

    public static void printRhombus(String s) {
        if (s.length() < 50) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    System.out.print(' ');
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
        } else {
            System.out.println("Превышена максимальная длина слова");
        }

    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

}
