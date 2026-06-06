package dev.victor.queue;

public class LinkedQueue<T> implements QueueTAD<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;
    private T item;

    public LinkedQueue(Node<T> node) {
        this.head = node;
        this.tail = node;
        this.size = 1;
    }

    @Override
    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) {
            head = newNode;
            tail.setNext(newNode);
        } else {
            tail.setNext(newNode);
        }

        tail = newNode;
        size = size + 1;
    }

    @Override
    public T pop() {
        if (size == 0) {
            System.out.println("Fila Vazia");
            return null;
        } else {
            item = head.getElement();
            head = head.getNext();
            size = size - 1;
        }

        if (size() == 0) {
            tail = null;
        }

        return item;
    }

    @Override
    public T peek() {
        return head.getElement();
    }

    @Override
    public T back() {
        return tail.getElement();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
    }

}
