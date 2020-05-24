package datastructure;


import datastructure.error.LinkedListException;

public interface LinkedList<T> {

    T getFirst() throws LinkedListException;

    T getLast() throws LinkedListException;

    T getAt(int index) throws LinkedListException;

    void addLast(T data);

    void addFirst(T data);

    void addAt(int index, T data) throws LinkedListException;

    void removeFirst() throws LinkedListException;

    void removeLast() throws LinkedListException;

    void removeAt(int index) throws LinkedListException;

    int size();

    void reverse();

}
