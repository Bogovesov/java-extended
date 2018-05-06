package com.alevel.bogovesov.hw4;

/*
Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из
отрезка [10;99]. Вывести массив на экран.
 */

import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        final int MIN_VALUE = 10;
        final int MAX_VALUE = 99;

        int[][] arrays = new int[8][5];
        Random random = new Random();

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE + 1);
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
