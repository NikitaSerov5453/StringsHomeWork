public class Lesson6 {
    /**
     * Задание 6
     * |В американской армии считается несчастливым число 13,
     * |а в китайской – 4. Перед совместными учениями с американской и китайской армией, штаб украинской армии
     * |решил исключить номера боевой техники, содержащие
     * |числа 4 или 13 (например, 40123, 13373, 12345 или 61342),
     * |чтобы не смущать иностранных коллег.
     * Написать программу, которая выведет на экран сколько
     * всего номеров придется исключить, если в распоряжении
     * армии имеется 100 тысяч единиц боевой техники и каждая
     * боевая машина имеет номер от 00000 до 99999. Решить,
     * используя строки.
     */

    public static void main(String[] args) {
        System.out.println(numberDeletedNumbers());
    }

    public static int numberDeletedNumbers() {
        int counter= 0;
        for (int i = 0; i < 100000; i++) {
            if (String.valueOf(i).contains("4") || String.valueOf(i).contains("13")) {
                counter++;
            }
        }
        return counter;
    }
}