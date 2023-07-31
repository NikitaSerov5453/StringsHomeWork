import java.util.Scanner;

public class Lesson8 {
    /**
     * Задание 8
     * |В языке Java принято первое слово, входящее в название
     * |переменной, записывать с маленькой латинской буквы.
     * |Следующее слово идет с большой буквы (только первая
     * |буква слова – большая). Слова не имеют разделителей и
     * |состоят только из латинских букв. Например, правильные
     * |записи переменных в Java могут выглядеть следующим
     * |образом: , ,
     * |name, nEERC.
     * |В языке C++ для описания переменных используются
     * |только маленькие латинские символы и символ «_»,
     * |который отделяет непустые слова друг от друга. Если
     * |строка имеет смешанный синтаксис: например java_
     * |сообщить об этом. Примеры: ,
     * |, name, n_e_e_r_c.
     * Вам требуется написать программу, которая преобразует
     * переменную, записанную на одном языке, в формат другого
     * языка. Идентификатор (имя) переменной должен вводится с
     * клавиатуры. Программа должна определить, из какого языка
     * взята переменная, и переделать ее в переменную другого
     * языка. Вывести результат на консоль.
     */
    public static void main(String[] args) {
        javaOrCPlusPlus(string);
    }

    public static String string = scanner().next();

    public static void javaOrCPlusPlus(String s) {
        boolean java = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_') {
                if (Character.isUpperCase(s.charAt(i + 1))) {
                    System.out.println("Это смешанный синтаксис");
                    return;
                }
                java = false;
                break;
            }
        }
        if (java == true) {
            System.out.println("Это Java");
            variableConversionToCPlusPlus(s);
        } else {
            System.out.println("Это C++");
            variableConversionToJava(s);
        }
    }

    public static void variableConversionToCPlusPlus(String s) {//aaaaaBaaaaaBaaa
        int sLength = s.length();
        for (int i = 0; i < sLength; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                s = s.substring(0, i) + "_" + s.substring(i, i + 1).toLowerCase() + s.substring(i + 1);
            }
        }
        System.out.println(s);
    }

    public static void variableConversionToJava(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '_') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(chars));
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '_') {
                stringBuilder.deleteCharAt(i);
            }
        }
        System.out.println(stringBuilder);
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}
