package dev.victor.queue;

public class ArrayQueue<T> implements QueueTAD<T> {

    private T[] data;
    private int head;
    private int tail;
    private int size;
    private T item;

    public ArrayQueue(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    @Override
    public void push(T element) {
        if (size() == data.length) {
            System.out.println("Array cheio");
        } else {
            data[tail] = element;
            tail = (tail + 1) % data.length;
            size = size + 1;
        }

    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Array vazio");
            return null;
        } else {
            item = data[head];
            head = (head + 1) % data.length;
            size = size - 1;

            return item;
        }

    }

    @Override
    public T peek() {
        return data[head];
    }

    @Override
    public T back() {
        return data[(tail - 1 + data.length) % data.length];
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
        head = 0;
        tail = 0;
        size = 0;

    }
}
