package com.alevel.bogovesov.hw4;

import java.util.Scanner;

/*
В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит
пользователь).
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        final float a = Math.abs(scanner.nextFloat());
        System.out.println("Enter b:");
        final float b = Math.abs(scanner.nextFloat());
        float s = 1f / 2f * (a * b);
        System.out.println("Area of triangle: " + s);
    }
}
