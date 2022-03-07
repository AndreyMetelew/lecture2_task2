package com.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        Scanner scan = new Scanner(System.in);

	    /* 1. Ввести с клавиатуры два числа, и вывести на экран минимальное из них. */

        int a, b;
        System.out.println("Давайте сравним, какое из двух чисел будет меньше: a или b?");
        System.out.print("Введите число a: ");
        a = scan.nextInt();
        System.out.print("Введите число b: ");
        b = scan.nextInt();
        System.out.print("Меньшее из двух чисел - ");
        if (a <= b)
            System.out.println("a: " + a);
        else
            System.out.println("b: " + b);
        System.out.println();

        /* 2. Ввести с клавиатуры четыре числа, и вывести максимальное из них. */

        int max, c, d;
        String max_one;
        System.out.println("Давайте сравним, какое из четырех чисел будет больше: a, b, c или d?");

        System.out.print("Введите число a: ");
        a = scan.nextInt();
        System.out.print("Введите число b: ");
        b = scan.nextInt();
        System.out.print("Введите число c: ");
        c = scan.nextInt();
        System.out.print("Введите число d: ");
        d = scan.nextInt();

        if (a >= b) {
            max = a;
            max_one = "a";
        } else {
            max = b;
            max_one = "b";
        }
        if (c > max) {
            max = c;
            max_one = "c";
        }
        if (d > max) {
            max = d;
            max_one = "d";
        }

        System.out.println("Самое большое число - " + max_one + ": " + max);
        System.out.println();

        /* 3. Ввести с клавиатуры три числа, и вывести их в порядке убывания. */

        int[] ms = new int[3];

        System.out.println("Введите 3 числа, я отсортирую их в порядке убывания");
        System.out.print("Первое число: ");
        ms[0] = scan.nextInt();
        System.out.print("Второе число: ");
        ms[1] = scan.nextInt();
        System.out.print("Третье число: ");
        ms[2] = scan.nextInt();

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (ms[j]>=ms[j-1]) {
                    int swap = ms[j-1];
                    ms[j-1]=ms[j];
                    ms[j] = swap;
                }
            }
        }
        System.out.print("Числа в порядке убывания: ");
        for (int i = 0; i < 3; i++)
            System.out.print(ms[i] + " ");
        System.out.println();
        System.out.println();

        /* 4. Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
        Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны». */

        String name1, name2;

        System.out.println("Давайте сравним два имени?");
        System.out.print("Первое имя: ");
        name1 = scan.nextLine();
        System.out.print("Второе имя: ");
        name2 = scan.nextLine();

        if (name1.equals(name2)) // Используем метод toEquals, чтобы сравнить, идентичны ли строки
            System.out.println("Имена идентичны");
        else if (!(name1.equals(name2)) && (name1.length() == name2.length()))
            // Кроме метода toEquals, используем метод length(), возвращающий число, равное количеству символов в строке
            System.out.println("Длины имен равны");
        System.out.println();

        /* 5. Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще». */

        System.out.println("Давай познакомимся?");
        System.out.print("Как тебя зовут? - ");
        String name = scan.nextLine();
        System.out.print("Сколько тебе лет? - ");
        int age = scan.nextInt();
        if (age < 18)
            System.out.println("Подрасти ещё, " + name);
        System.out.println();

        /* 6. Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно» */

        System.out.println("Давай познакомимся?");
        System.out.print("Как тебя зовут? - ");
        name = scan.nextLine();
        System.out.print("Сколько тебе лет? - ");
        age = scan.nextInt();
        if (age > 20)
            System.out.println("И 18-ти достаточно, " + name);
        System.out.println();
    }
}