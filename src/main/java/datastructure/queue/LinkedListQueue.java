package datastructure.queue;

import error.QueueException;

public class LinkedListQueue<T> implements Queue<T> {

    private static class Node<T> {


        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        private T data;
        private Node next;
    }

    private Node head;
    private Node tail;

    @SuppressWarnings("unchecked")
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new QueueException("queue is empty!");
        } else {
            T node = (T) head.data;
            head = head.next;
            return node;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void enqueue(T item) {
        if (isEmpty()) {
            Node node = new Node(item, null);
            tail = node;
            head = node;
        } else {
            Node node = new Node(item, null);
            tail.next = node;
            tail = node;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getFront() {
        if (isEmpty()) {
            throw new QueueException("queue is empty!");
        } else {
            return (T) head.data;
        }
    }

    @Override
    public void clear() {
        head.next = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
