package com.alevel.lecture10;

import com.alevel.lecture10.collection.CustomArrayList;
import com.alevel.lecture10.model.Cat;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Cat> catCustomArrayList = new CustomArrayList<Cat>();

        catCustomArrayList.add(new Cat(1, "Barsik1"));
        catCustomArrayList.add(new Cat(2, "Barsik2"));
        catCustomArrayList.add(new Cat(3, "Barsik3"));
        catCustomArrayList.add(new Cat(4, "Barsik4"));
        catCustomArrayList.add(new Cat(5, "Barsik5"));
        catCustomArrayList.add(new Cat(6, "Barsik6"));
        catCustomArrayList.add(new Cat(7, "Barsik7"));

        Cat cat8 = new Cat(8, "Barsik8");
        catCustomArrayList.add(3, cat8);

        for (int i = 0; i < catCustomArrayList.length(); i++) {
            Cat cat = catCustomArrayList.get(i);
            System.out.println(cat);
        }
        System.out.println(catCustomArrayList.contains(cat8));

        System.out.println(catCustomArrayList.remove(3));
        System.out.println(catCustomArrayList.contains(cat8));
        System.out.println(catCustomArrayList.remove(5));

        System.out.println("After delete");
        for (int i = 0; i < catCustomArrayList.length(); i++) {
            Cat cat = catCustomArrayList.get(i);
            System.out.println(cat);
        }
        catCustomArrayList.clear();
    }
}
