package com.alevel.bogovesov.hw4;

import java.util.Random;

/*
Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из
отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с
наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести
индекс первой встретившейся из них.
 */

public class Task13 {
    public static void main(String[] args) {
        final int MIN_VALUE = -5;
        final int MAX_VALUE = 5;

        int[][] arrays = new int[7][4];
        Random random = new Random();

        int maxProduct = 0, index = -1;
        for (int i = 0; i < arrays.length; i++) {
            int product = 1;
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE + 1);
                System.out.print(arrays[i][j] + " ");

                product *= Math.abs(arrays[i][j]);
            }
            if (product > maxProduct) {
                maxProduct = product;
                index = i;
            }
            System.out.println();
        }
        System.out.println("Index: " + index);
    }
}
