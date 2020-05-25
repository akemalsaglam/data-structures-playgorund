package datastructure.queue;

import error.QueueException;

public class ArrayQueue<T> implements Queue<T> {

    private static final int INITIAL_CAPACITY = 10;
    private int currentSize;
    private int capacity;
    private int backIndex;
    private int frontIndex;
    private T[] items;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        items = (T[]) new Object[INITIAL_CAPACITY];
        backIndex = -1;
        frontIndex = 0;
        currentSize = 0;
        capacity = INITIAL_CAPACITY;
    }

    @Override
    public T dequeue() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("queue is empty!");
        } else {
            T front = getFront();
            items[frontIndex % capacity] = null;
            frontIndex++;
            currentSize--;
            return front;
        }
    }

    @Override
    public void enqueue(T item) {
        if (isFull()) {
            throw new QueueException("queue is full!");
        } else {
            backIndex++;
            items[backIndex % capacity] = item;
            currentSize++;
        }
    }

    @Override
    public T getFront() {
        if (isEmpty()) {
            throw new QueueException("queue is empty!");
        } else {
            return items[frontIndex % capacity];
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < capacity; i++) {
            items[i] = null;
        }
        backIndex = -1;
        frontIndex = 0;
        currentSize = 0;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    private boolean isFull() {
        return currentSize == capacity;
    }
}
