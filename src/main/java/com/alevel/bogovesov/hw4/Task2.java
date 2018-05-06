package com.alevel.bogovesov.hw4;

/*
    Создать класс Dog, который будет содержать 2 поля name и says. В main( ) создать 2
    экземпляра класса с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля
    объектов.

    Да я знаю что классы должны находится в отдельных файлах, но для этой задачи поместил в одном
 */

class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", says='" + says + '\'' +
                '}';
    }
}

public class Task2 {
    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Ruff!");
        Dog scruffy = new Dog("scruffy", "Wurf!");

        System.out.println(spot);
        System.out.println(scruffy);
    }
}
