package com.alevel.bogovesov.hw4;

import java.util.Scanner;

/*
Создать программу, проверяющую и сообщающую на экран, является ли целое число,
записанное в переменную n, чётным либо нечётным (n – вводит пользователь).
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " четное ");
        } else {
            System.out.println("Число " + number + " нечетное ");
        }
    }
}
