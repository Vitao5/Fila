package dev.victor.queue;

public interface QueueTAD<T> {
    void push(T element);
    T pop();
    T peek();
    T back();
    int size();
    boolean isEmpty();
    void clear();
}