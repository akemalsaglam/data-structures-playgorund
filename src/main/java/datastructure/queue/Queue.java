package datastructure.queue;

import error.QueueException;

public interface Queue<T> {

    T dequeue() throws QueueException;

    void enqueue(T item) throws QueueException;

    T getFront() throws QueueException;

    void clear();

    boolean isEmpty();
}
