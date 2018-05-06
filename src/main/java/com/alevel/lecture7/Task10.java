package com.alevel.lecture7;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        final int size = 3;
        int[][] matrix = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        int[] sumColumn = new int[size];
        int[] sumRows = new int[size];

        for (int i = 0; i < matrix.length; i++) {
            int sum1 = 0, sum2 = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum1 += matrix[i][j];
                sum2 += matrix[j][i];
            }
            sumColumn[i] = sum1;
            sumRows[i] = sum2;
        }

        boolean notEquals = false;
        for (int i = 0; i < sumColumn.length; i++) {
            if (sumColumn[i] != sumRows[i]) {
                notEquals = true;
                break;
            }
        }

        if (notEquals) {
            System.out.println("Matrix is not magic");
        } else {
            System.out.println("Matrix is magic");
        }
    }
}
