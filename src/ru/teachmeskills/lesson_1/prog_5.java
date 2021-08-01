package ru.teachmeskills.lesson_1;

public class prog_5 {
    // Даны 3 целых числа. Найти количество положительных и отрицательных
    // чисел в исходном наборе.

    static int posCounter = 0; // Статические переменные-счётчики для всего класса prog_5
    static int negCounter = 0;

    public static void main(String[] args) {
        int a = 3;
        int b = -9;
        int c = 0;

        check(a);
        check(b);
        check(c);
        System.out.println("Количество положительных переменных - " + posCounter);
        System.out.println("Количество отрицательных переменных - " + negCounter);
    }

    public static void check(int number) {
        if (number > 0) {
            posCounter++;
        }
        if (number < 0) {
            negCounter++;
        }
    }

}
