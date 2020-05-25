package datastructure.arraylist;

import error.ArrayListException;

public interface ArrayList<T> {

    void add(T item);

    T get(int index) throws ArrayListException;

    void remove(int index) throws ArrayListException;

    int size();
}
