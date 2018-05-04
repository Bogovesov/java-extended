package com.alevel.bogovesov.hw4;

/*
    Создать класс, который содержит int и char (не проинициализированные) и распечатать их
    значения.
 */
class SomeCLass {
    private int number;
    private char character;

    public int getNumber() {
        return number;
    }

    public char getCharacter() {
        return character;
    }
}

public class Task1 {
    public static void main(String[] args) {
        SomeCLass someCLass = new SomeCLass();
        System.out.println(someCLass.getCharacter());
        System.out.println(someCLass.getNumber());
    }
}
