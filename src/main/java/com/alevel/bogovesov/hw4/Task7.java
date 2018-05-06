package com.alevel.bogovesov.hw4;

import java.util.Scanner;

/*
В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
будет находить и выводить на экран вещественные корни квадратного уравнения
ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь).
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        float a = scanner.nextFloat();
        System.out.println("Enter b:");
        float b = scanner.nextFloat();
        System.out.println("Enter c:");
        float c = scanner.nextFloat();

        double D = Math.pow(b, 2) - 4 * a * c;
        System.out.println("D: " + D);
        if (a != 0) {
            if ((D > 0)) {
                double x1 = (-b + Math.sqrt(D)) / 2 * a;
                double x2 = (-b - Math.sqrt(D)) / 2 * a;
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            } else if (D == 0) {
                double x = -(b / 2 * a);
                System.out.println("x: " + x);
            } else {
                System.out.println("D < 0");
            }
        } else {
            System.out.println("a == 0");
        }
    }
}
