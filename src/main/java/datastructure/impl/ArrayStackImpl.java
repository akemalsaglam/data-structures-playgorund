package datastructure.impl;

import datastructure.Stack;
import datastructure.error.StackException;

public class ArrayStackImpl<T> implements Stack<T> {

    private static final int INITIAL_CAPACITY = 10;
    private int cursor = -1;
    private T[] items;

    @SuppressWarnings("unchecked")
    public ArrayStackImpl() {
        this.items = (T[]) new Object[INITIAL_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayStackImpl(int capacity) {
        this.items = (T[]) new Object[capacity];
    }

    @Override
    public T pop() {
        T peekItem = peek();
        items[cursor] = null;
        cursor--;
        return peekItem;
    }

    @Override
    public void push(T item) {
        if (cursor == items.length - 1) {
            throw new StackException("stack is overflowed!");
        } else {
            cursor++;
            items[cursor] = item;
        }
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            throw new StackException("stack is empty");
        } else {
            return items[cursor];
        }
    }

    @Override
    public boolean isEmpty() {
        return this.cursor == -1;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= cursor; i++) {
            items[i] = null;
        }
        cursor = -1;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "stack is empty!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < cursor; i++) {
                sb.append(items[i]).append(",");
            }
            sb.append(items[cursor]).append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        ArrayStackImpl stack = new ArrayStackImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    }
}
