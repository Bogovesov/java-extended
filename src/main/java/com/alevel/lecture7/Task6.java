package com.alevel.lecture7;

import com.alevel.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = Arrays.getArray(10, 10);
        int index1 = 0, index2 = 0;

        int number = 5;
        int minimalDistance = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j != i) {
                    int avg = (numbers[i] + numbers[j]) / 2;
                    int distance = Math.abs(avg - number);
                    if (distance < minimalDistance) {
                        minimalDistance = distance;
                        index1 = i;
                        index2 = j;
                    }
                }
            }
        }
        Arrays.printArray(numbers);
        System.out.println("index1  = " + index1 + " index2 = " + index2);
    }
}
