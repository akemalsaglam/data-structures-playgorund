package datastructure;

public class CustomLinkedList<T> {

    private class Node<T> {

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        private T data;
        private Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public T getFirst() throws Exception {
        if (size == 0) {
            throw new Exception("list is empty!");
        } else {
            return (T) this.head.data;
        }
    }

    public T getLast() throws Exception {
        if (size == 0) {
            throw new Exception("list is empty!");
        } else {
            return (T) this.tail.data;
        }
    }

    public T getAt(int index) throws Exception {
        if (size == 0) {
            throw new Exception("list is empty!");
        } else if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index is out of bounds!");
        } else {
            Node tempNode = this.head;
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.next;
            }
            return (T) tempNode.data;
        }
    }

    public Node getNodeAt(int index) throws Exception {
        if (size == 0) {
            throw new Exception("list is empty!");
        } else if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index is out of bounds!");
        } else {
            Node tempNode = this.head;
            for (int i = 1; i < index; i++) {
                tempNode = tempNode.next;
            }
            return tempNode;
        }
    }

    public void addLast(T data) {
        Node tempNode = new Node(data, null);
        this.tail.next = tempNode;
        this.tail = tempNode;
        if (this.size == 0) {
            this.head = tempNode;
        }
        this.size++;
    }

    public void addFirst(T data) {
        Node tempNode = new Node(data, this.head);
        this.head = tempNode;
        if (size == 0) {
            this.tail = tempNode;
        }
        this.size++;
    }

    public void addAt(int index, T data) throws Exception {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("index is out of bound!");
        }
        if (index == 0) {
            this.addFirst(data);
        } else if (index == size) {
            this.addLast(data);
        } else {
            Node tempNode = this.getNodeAt(index - 1);
            Node newNode = new Node(data, tempNode.next);
            tempNode.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (size == 0) {
            throw new Exception("lis is already empty!");
        } else if (size == 1) {
            this.tail = null;
            this.head = null;
            size--;
        } else {
            this.head = this.head.next;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("lis is already empty!");
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

    public void removeAt(int index) throws Exception {
        if (size == 0) {
            throw new Exception("lis is already empty!");
        } else if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index is out of bound!");
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

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


}
