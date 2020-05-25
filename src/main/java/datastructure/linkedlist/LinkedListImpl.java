package datastructure.linkedlist;

import error.LinkedListException;

public class LinkedListImpl<T> implements LinkedList<T> {

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
    private int size;


    @Override
    public T getFirst() {
        if (size == 0) {
            throw new LinkedListException("list is empty!");
        } else {
            return (T) this.head.data;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getLast() {
        if (size == 0) {
            throw new LinkedListException("list is empty!");
        } else {
            return (T) this.tail.data;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getAt(int index) {
        if (size == 0) {
            throw new LinkedListException("list is empty!");
        } else if (index < 0 || index >= size) {
            throw new LinkedListException("index is out of bounds!");
        } else {
            Node tempNode = this.head;
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.next;
            }
            return (T) tempNode.data;
        }
    }


    private Node getNodeAt(int index) {
        if (size == 0) {
            throw new LinkedListException("list is empty!");
        } else if (index < 0 || index >= size) {
            throw new LinkedListException("index is out of bounds!");
        } else {
            Node tempNode = this.head;
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.next;
            }
            return tempNode;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addLast(T data) {
        Node tempNode = new Node(data, null);
        if (this.size == 0) {
            this.head = tempNode;
            this.tail = tempNode;
        } else {
            this.tail.next = tempNode;
            this.tail = tempNode;
        }
        this.size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addFirst(T data) {
        Node tempNode = new Node(data, this.head);
        this.head = tempNode;
        if (size == 0) {
            this.tail = tempNode;
        }
        this.size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addAt(int index, T data) {
        if (index < 0 || index > size) {
            throw new LinkedListException("index is out of bound!");
        }
        if (index == 0) {
            this.addFirst(data);
        } else if (index == size) {
            this.addLast(data);
        } else {
            Node tempNode = this.getNodeAt(index - 1);
            tempNode.next = new Node(data, tempNode.next);
            size++;
        }
    }

    @Override
    public void removeFirst() {
        if (size == 0) {
            throw new LinkedListException("lis is already empty!");
        } else if (size == 1) {
            this.tail = null;
            this.head = null;
            size--;
        } else {
            this.head = this.head.next;
            size--;
        }
    }

    @Override
    public void removeLast() {
        if (size == 0) {
            throw new LinkedListException("lis is already empty!");
        } else if (size == 1) {
            this.tail = null;
            this.head = null;
            size--;
        } else {
            this.tail = this.getNodeAt(size - 2);
            this.tail.next = null;
            size--;
        }
    }

    @Override
    public void removeAt(int index) {
        if (size == 0) {
            throw new LinkedListException("list is already empty!");
        } else if (index < 0 || index >= size) {
            throw new LinkedListException("index is out of bound!");
        } else if (index == 0) {
            this.removeFirst();
        } else if (index == size - 1) {
            this.removeLast();
        } else {
            Node temp = this.getNodeAt(index - 1);
            temp.next = temp.next.next;
            size--;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void reverse() {
        if (size != 0) {
            Node cursorNode = this.head;
            Node nextNode;
            Node previousNode = null;
            while (cursorNode != null) {
                nextNode = cursorNode.next;
                cursorNode.next = previousNode;
                previousNode = cursorNode;
                cursorNode = nextNode;
            }
            this.tail = this.head;
            this.head = previousNode;
        }
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListImpl<String> list = new LinkedListImpl<String>();
        list.addFirst("ezgi");
        list.addLast("ali");
        list.display();
    }

}
