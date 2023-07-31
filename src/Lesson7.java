import java.util.Scanner;

public class Lesson7 {
    /**
     * Задание 7
     * Пользователь вводит с клавиатуры любую строку.
     * Поменять в исходной строке все большие буквы на
     * маленькие, а маленькие – на большие. Если в строке присутствуют цифры, заменить на символ подчеркивания и
     * вывести результат на консоль.
     */

    public static void main(String[] args) {
        caseInversionLetters(stringToCharArray(string));
    }

    public static String string = scanner().next();

    public static char[] stringToCharArray(String s) {
        return s.toCharArray();
    }

    public static void caseInversionLetters(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else if (chars[i] == '0' || chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' ||
                    chars[i] == '6' || chars[i] == '7' || chars[i] == '8' || chars[i] == '9') {
                chars[i] = '_';
            }
        }
        System.out.println(chars);
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
