package datastructure.stack;

import error.StackException;

public class ArrayStack<T> implements Stack<T> {

    private static final int INITIAL_CAPACITY = 10;
    private int cursor = -1;
    private T[] items;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        items = (T[]) new Object[INITIAL_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        items = (T[]) new Object[capacity];
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
        if (isEmpty()) {
            throw new StackException("stack is empty");
        } else {
            return items[cursor];
        }
    }

    @Override
    public boolean isEmpty() {
        return cursor == -1;
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
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
    }
}
