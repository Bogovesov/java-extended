package com.alevel.lecture10.collection;

public class CustomArrayList<T> {
    private final int INIT_SIZE = 0;

    private Object[] localData;

    public CustomArrayList() {
        init();
    }

    private void init() {
        this.localData = new Object[ INIT_SIZE];
    }

    public void add(T object) {
        add(localData.length, object);
    }

    public void add(int index, T object) {
        if (index == localData.length) {
            expand();
            localData[localData.length - 1] = object;
        } else {
            insertTo(index, object);
        }
    }

    public T remove(int index) {
        T removedElements = (T) localData[index];
        Object[] tmp = new Object[localData.length - 1];
        int j = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (i == index) {
                j++;
            }
            tmp[i] = localData[j];
            j++;
        }
        localData = tmp;
        return removedElements;
    }

    public T get(int index) {
        return (T) localData[index];
    }

    public int length() {
        return localData.length;
    }

    public boolean contains(T object) {
        for (int i = 0; i < localData.length; i++) {
            if (localData[i] == object) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        init();
    }

    private void insertTo(int index, T object) {
        Object[] tmp = new Object[localData.length + 1];
        int j = 0;
        for (int i = 0; i < localData.length; i++) {
            if (i == index) {
                tmp[j] = object;
                j++;
            }
            tmp[j] = localData[i];
            j++;
        }
        localData = tmp;
    }

    private void expand() {
        Object[] tmp = new Object[localData.length + 1];
        System.arraycopy(localData, 0, tmp, 0, localData.length);
        localData = tmp;
    }
}
