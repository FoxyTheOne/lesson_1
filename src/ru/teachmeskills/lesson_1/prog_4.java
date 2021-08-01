package ru.teachmeskills.lesson_1;

public class prog_4 {
    // Даны 3 целых числа. Найти количество положительных чисел в исходном
    // наборе.

    static int posNumbers = 0; // Статическая переменная-счётчик для всего класса prog_4

    public static void main(String[] args) {
        int a = 3;
        int b = -9;
        int c = 0;

        check(a);
        check(b);
        check(c);
        System.out.println("Количество положительных переменных - " + posNumbers);
    }

    public static void check(int number) {
        if (number > 0) {
            posNumbers++;
        }
    }

}

