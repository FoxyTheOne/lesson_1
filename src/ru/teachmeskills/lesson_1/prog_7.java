package ru.teachmeskills.lesson_1;

public class prog_7 {
    // (Дополнительно) В переменную записываете количество программистов. В
    // зависимости от количества программистов необходимо вывести правильно
    // окончание. Например:
    // • 2 программиста
    // • 1 программист
    // • 10 программистов
    // • и т.д.

    public static void main(String[] args) {
        int a = 450;
        int b = a; // Ввожу вторую переменную для подсчета после 20ти

        if (a <= 20) {
            ending(a, a);
        } else {
            while (b > 10) {
                b = a % 10; // Берем остаток от деления числа на десятки, чтобы определить последнюю цифру
            }
            ending(b, a);
        }
    }

    public static void ending(int number, int aNumber) {
        if (number == 1) {
            System.out.println(aNumber + " программист");
        } else if (number > 1 && number < 5) {
            System.out.println(aNumber + " программиста");
        } else {
            System.out.println(aNumber + " программистов");
        }
    }
}
