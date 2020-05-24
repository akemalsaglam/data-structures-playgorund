package datastructure;

import datastructure.error.StackException;

public interface Stack<T> {

    T pop() throws StackException;

    void push(T item) throws StackException;

    T peek() throws StackException;

    boolean isEmpty();

    void clear();
}
