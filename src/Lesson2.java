import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson2 {
    /**
     * Задание 2
     * Написать программу, которая создаст строку, в которой
     * находятся все целые числа, начиная с 1, выписаны в одну
     * строку «123456789101112131415...». Строка должна быть
     * длиной не более 1 000 символов.
     * По числу n (введенного с клавиатуры), выведите цифру на
     * n-й позиции (используется нумерация с 1).
     */

    public static void main(String[] args) {
        number = createNumber(number);
        System.out.println(number);
        System.out.println(searchNumber(number, index));
    }

    public static String number = "1";
    public static int index = scanner().nextInt();

    public static String createNumber(String number) {
        StringBuilder numberBuilder = new StringBuilder(number);
        for (int i = 0; i < random(100, 1000); i++) {
            numberBuilder.append(random(0, 9));
        }
        return numberBuilder.toString();
    }

    public static char searchNumber(String number, int index) {
        return number.charAt(index);
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static int random(int minValue, int maxValue) {
        return ThreadLocalRandom.current().nextInt(minValue, maxValue);
    }
}
