package datastructure.impl;

import datastructure.ArrayList;
import datastructure.error.ArrayListException;

public class ArrayListImpl<T> implements ArrayList<T> {

    private T[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;
    private int cursor;

    @SuppressWarnings("unchecked")
    public ArrayListImpl() {
        data = (T[]) new Object[INITIAL_CAPACITY];
        size = INITIAL_CAPACITY;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(T item) {
        if (cursor == size) {
            T[] tempData = (T[]) new Object[size + INITIAL_CAPACITY];

            int tempCursor = 0;
            for (int i = 0; i < data.length; i++) {
                tempData[i] = data[i];
                tempCursor++;
            }
            data = tempData;

            data[tempCursor] = item;
            tempCursor++;

            cursor = tempCursor;
            size += INITIAL_CAPACITY;

        } else {
            data[cursor] = item;
            cursor++;
        }

    }

    @Override
    public T get(int index) {
        if (index < 0 || index > cursor - 1) {
            throw new ArrayListException("index out of bound!");
        }
        return data[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > cursor - 1) {
            throw new ArrayListException("index out of bound!");
        }
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        cursor--;
    }

    @Override
    public int size() {
        return cursor;
    }
}
