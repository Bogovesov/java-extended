package com.alevel.bogovesov.hw4;

import java.util.Scanner;

/*
Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m –
вводит пользователь).
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        final float n = scanner.nextFloat();
        System.out.println("Enter second number:");
        final float m = scanner.nextFloat();
        System.out.println("Enter main number:");
        final int number = scanner.nextInt();

        float distanceN = Math.abs(number - n);
        System.out.println("Distance N:" + distanceN);
        float distanceM = Math.abs(number - m);
        System.out.println("Distance M:" + distanceM);

        if (distanceM < distanceN) {
            System.out.println("Number m: " + m + " nearer to " + number);
        } else if (distanceN < distanceM) {
            System.out.println("Number n: " + n + " nearer to " + number);
        } else if (distanceM == distanceN){
            System.out.println("Number m: " + m + " and n " + n + " are the same");
        }
    }
}
