package com.alevel.lecture10.collection;

public class CustomArrayList<T>  {
    private T[] list;

    public void add(T t) {
        list[list.length - 1] = t;
    }
}
