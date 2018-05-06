package com.alevel.bogovesov.hw4;

import java.math.BigInteger;

/*
Создать класс, который будет хранить в одной целочисленной переменной несколько
значений меньшей длины. Например, возраст, вес, рост и год рождения. Добавить методы
получения и добавления параметров отдельно.
 */
class Number {
    private long data;

    public void setAge(int age) {
        data += age;
    }

    public int getAge() {
        return (int) (data & 0xff);
    }

    public void setWeight(int weight) {
        data += (weight << 8);
    }

    public int getWeight() {
        return (int) ((data >> 8) & 0xff);
    }

    public void setGrowth(int growth) {
        data += (growth << 16);
    }

    public int getGrowth() {
        return (int) ((data >> 16) & 0xff);
    }

    public void setBirthday(int birthday) {
        data += (birthday << 24);
    }

    public int getBirthday() {
        return (int) ((data >> 24) & 0xffff);
    }
}

public class Task8 {
    public static void main(String[] args) {
        Number number = new Number();
        number.setAge(25);
        System.out.println(number.getAge());

        number.setWeight(80);
        System.out.println(number.getWeight());

        number.setGrowth(185);
        System.out.println(number.getGrowth());

        number.setBirthday(1990);
        System.out.println(number.getBirthday());
    }
}
