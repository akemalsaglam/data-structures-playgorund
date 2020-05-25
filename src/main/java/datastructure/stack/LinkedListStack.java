package datastructure.stack;

import error.StackException;

public class LinkedListStack<T> implements Stack<T> {

    private Node<T> cursorNode;

    private static class Node<T> {
        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        private T data;
        private Node next;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (isEmpty()) throw new StackException("stack is empty!");
        T node = peek();
        cursorNode = cursorNode.next;
        return node;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void push(T item) {
        cursorNode = new Node(item, cursorNode);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new StackException("stack is empty!");
        } else {
            return cursorNode.data;
        }
    }

    @Override
    public boolean isEmpty() {
        return cursorNode == null;
    }

    @Override
    public void clear() {
        cursorNode = null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "stack is empty!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            Node node = cursorNode;
            while (node.next != null) {
                sb.append(node.data).append(",");
                node = node.next;
            }
            sb.append(node.data).append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.toString());
    }
}
