package com.alevel.bogovesov.hw4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*
Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за
сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */
public class Task14 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                String tmp = "";
                if (i < 10) {
                    tmp += "0" + i;
                } else {
                    tmp += i;
                }
                if (j < 10) {
                    tmp += ":0" + j;
                } else {
                    tmp += ":" + j;
                }

                if ((tmp.charAt(0) == tmp.charAt(tmp.length() - 1))
                        && (tmp.charAt(1) == tmp.charAt(tmp.length() - 2))) {
                    System.out.println(tmp);
                    counter++;
                }
            }
        }

        System.out.println("Counter: " + counter);
    }
}
