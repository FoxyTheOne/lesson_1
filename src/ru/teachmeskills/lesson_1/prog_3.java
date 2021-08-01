package ru.teachmeskills.lesson_1;

public class prog_3 {
    // Дано целое число. Если оно является положительным, то прибавить к нему 1.
    // Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
    // 10. Вывести полученное число.

    public static void main(String[] args) {
        int a = 0;

        if (a > 0) {
            System.out.println(++a);
        } else if (a < 0) {
            a = a - 2;
            System.out.println(a);
        } else {
            System.out.println(a = 10);
        }

    }
}
