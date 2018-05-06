package com.alevel.bogovesov.hw4;

import java.util.Scanner;

/*
Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
первый и второй члены последовательности равны единицам, а каждый следующий — сумме
двух предыдущих.
 */
public class Task10 {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;

        System.out.println("Enter size of fibonachi: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        System.out.print(n0 + " " + n1 + " ");

        for (int i = 3; i <= size; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}
