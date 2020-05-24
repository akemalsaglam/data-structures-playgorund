package datastructure.impl;

import datastructure.ArrayList;
import datastructure.error.ArrayListException;

public class ArrayListImpl<T> implements ArrayList<T> {

    private T[] data;
    private int size;
    private static final int SIZE_FACTOR = 10;
    private int cursor;

    @SuppressWarnings("unchecked")
    public ArrayListImpl() {
        this.data = (T[]) new Object[SIZE_FACTOR];
        this.size = SIZE_FACTOR;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(T item) {
        if (this.cursor == size) {
            T[] tempData = (T[]) new Object[this.size + SIZE_FACTOR];

            int tempCursor = 0;
            for (int i = 0; i < this.data.length; i++) {
                tempData[i] = this.data[i];
                tempCursor++;
            }
            this.data = tempData;

            this.data[tempCursor] = item;
            tempCursor++;

            this.cursor = tempCursor;
            this.size += SIZE_FACTOR;

        } else {
            this.data[this.cursor] = item;
            this.cursor++;
        }

    }

    @Override
    public T get(int index) {
        if (index < 0 || index > cursor - 1) {
            throw new ArrayListException("index out of bound!");
        }
        return this.data[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > cursor - 1) {
            throw new ArrayListException("index out of bound!");
        }
        for (int i = index; i < this.data.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.cursor--;
    }

    @Override
    public int size() {
        return cursor;
    }
}
