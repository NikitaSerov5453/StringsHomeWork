import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson12 {
    /**
     * Напишите программу, которая посчитает количество
     * смайликов в заданном тексте.
     * Смайликом будем считать последовательность символов,
     * удовлетворяющую условиям:
     * ■ первым символом является либо ; (точка с запятой) либо
     * : (двоеточие) ровно один раз;
     * ■ далее может идти символ – (минус) сколько угодно раз (в
     * том числе символ минус может идти ноль раз);
     * ■ в конце обязательно идет некоторое количество (не меньше
     * одной) одинаковых скобок из следующего набора: (, ), [, ];
     * ■ внутри смайлика не может встречаться никаких других
     * символов.
     * Например, нижеприведенные последовательности являются смайликами:
     * :)
     * ;---------[[[[[[[[
     * в то время как нижеследующие последовательности
     * смайликами не являются (хотя некоторые из них содержат
     * смайлики):
     * :-)]
     * ;--
     * -)
     * ::-(
     * :-()
     */

    public static void main(String[] args) {
        searchSmileyFace(strings);
        System.out.println(a(text));
    }

    public static String text = ";---------[[[[[[[[ :) :-)] :-()";
    public static String pattern = "^[;|:]{1}-{0,}((\\({1,}|\\){1,})|(\\[{1,}|]{1,}))";
    public static String string;
    public static String[] strings = text.split(" ");


    public static void searchSmileyFace(String[] strings) {
        int counter = 0;
        for (String string : strings) {
            if (a(string).length() == string.length()) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static String a(String string) {
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher matcher = pattern1.matcher(string);
        while (matcher.find()) {
            return string.substring(matcher.start(), matcher.end());
        }
        return "";
    }

}
