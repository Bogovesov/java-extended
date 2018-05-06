package com.alevel.lecture7;

import com.alevel.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Size array: ");
        int sizeArray = in.nextInt();

        int[] numbers = Arrays.getArray(sizeArray,10);
        Arrays.printArray(numbers);
/*
        int countSwap = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > number) {
                numbers[i] = number;
                countSwap++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("Cnt swap: " + countSwap);
*/
        System.out.println("Task 2");

        int cntPositiv = 0, cntNegativ = 0, cntZero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                cntZero++;
            }
            if (numbers[i] > 0) {
                cntPositiv++;
            }
            if (numbers[i] < 0) {
                cntNegativ++;
            }
        }
        System.out.println("positiv: " + cntPositiv +
                " negativ: " + cntNegativ + " zero: " + cntZero);
    }
}
