package com.alevel.lecture10;

import com.alevel.lecture10.collection.CustomLinkedList;
import com.alevel.lecture10.model.Cat;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            CustomLinkedList<Cat> catCustomLinkedList = new CustomLinkedList<Cat>();
            catCustomLinkedList.addFirst(new Cat(1, "cat1"));
            catCustomLinkedList.addFirst(new Cat(2, "cat2"));
            catCustomLinkedList.addFirst(new Cat(3, "cat3"));
            catCustomLinkedList.addFirst(new Cat(4, "cat4"));
            catCustomLinkedList.addFirst(new Cat(5, "cat5"));
            catCustomLinkedList.addFirst(new Cat(6, "cat6"));
            catCustomLinkedList.addFirst(new Cat(7, "cat7"));

            boolean exit = false;
            while (!exit) {
                Cat cat = catCustomLinkedList.removeLast();
                if (cat == null) {
                    exit = true;
                    break;
                }
                System.out.println(cat);
            }
        }
    }
}
