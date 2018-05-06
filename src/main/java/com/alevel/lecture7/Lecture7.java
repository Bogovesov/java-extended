package com.alevel.lecture7;

import com.alevel.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Lecture7 {
    public static void main(String[] args) {
        System.out.println("Enter size of array:");
        Scanner in = new Scanner(System.in);
        int sizeArray = in.nextInt();

        System.out.println("Enter range random:");
        int range = in.nextInt();

        int[] numbers = Arrays.getArray(sizeArray,range);
        int[] tempArray = new int[sizeArray];

        int countNotSameElements = 0, cntZero = 0;
        for (int i = 0; i < numbers.length; i++) {
            int flag = 0;
            for (int j = 0; j < tempArray.length; j++) {
                if ((tempArray[j] == numbers[i])) {
                    flag++;

                    if ((numbers[i] == 0) && (cntZero  == 0)) {
                        cntZero++;
                    }
                    break;
                }
            }

            if (flag == 0) {
                tempArray[i] = numbers[i];
                countNotSameElements++;
            }
        }

        countNotSameElements += cntZero;

        System.out.println("Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        /*System.out.println("Temp array: ");
        for (int i = 0; i < tempArray.length; i++) {
            System.out.print(tempArray[i] + " ");
        }*/

        System.out.println("");
        System.out.println("Result: " + countNotSameElements);
    }

}
