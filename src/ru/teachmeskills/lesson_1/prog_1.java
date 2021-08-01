package ru.teachmeskills.lesson_1;

public class prog_1 {
    // В переменную записываем число. Надо вывести на экран сколько в этом
    // числе цифр и положительное оно или отрицательное. Например, "это
    // однозначное положительное число". Достаточно будет определить, является ли
    // число однозначным, "двухзначным или трехзначным и более.

    static int tenCounter = 0; // Статическая переменная-счётчик для всего класса prog_1

    public static void main(String[] args) {
        int a = 0;

        tenCounting(a);

        // System.out.println(tenCounter);

        if (a > 0) {
            if (tenCounter == 1) {
                System.out.println("это однозначное положительное число");
            } else if (tenCounter == 2) {
                System.out.println("это двузначное положительное число");
            } else if (tenCounter == 3) {
                System.out.println("это трехзначное положительное число");
            } else {
                System.out.println("это положительное число, четырехзначное или более");
            }
        } else if (a < 0) {
            if (tenCounter == 1) {
                System.out.println("это однозначное отрицательное число");
            } else if (tenCounter == 2) {
                System.out.println("это двузначное отрицательное число");
            } else if (tenCounter == 3) {
                System.out.println("это трехзначное отрицательное число");
            } else {
                System.out.println("это отрицательное число, четырехзначное или более");
            }
        } else {
            System.out.println("0 - не отрицательное и не положительное однозначное число");
        }

    }

    public static void tenCounting(int number) {
        while (number > 0) {
            tenCounter++; // Заданное число делим на 10 и считаем, сколько раз мы это сделали
            number = number/10;
        }
    }

}
