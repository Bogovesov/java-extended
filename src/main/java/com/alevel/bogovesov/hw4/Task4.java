package com.alevel.bogovesov.hw4;

import java.util.Scanner;

/*
В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую
и выводящую на экран сумму цифр числа n (n – вводит пользователь).
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = in.nextInt();


        if (number > 0) {
            int sum = 0;
            boolean flag = false;
            do {
                if (number > 9) {
                    sum += (number % 10);

                    if (number > 10) {
                        number /= 10;

                        if (number < 10) {
                            sum += number;
                            flag = true;
                        }

                    }else if (number == 10) {
                        sum += 1;
                        flag = true;
                    }
                } else {
                    sum = number;
                    flag = true;
                }
            } while (!flag);
            System.out.println("sum is: " + sum);
        } else {
            System.out.println("sum is: " + number);
        }
    }
}
