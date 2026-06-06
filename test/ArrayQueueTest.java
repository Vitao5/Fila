package test;

import dev.victor.queue.ArrayQueue;

public class ArrayQueueTest {

    public static void rodarTestArray() {

        ArrayQueue<Integer> queue = new ArrayQueue<Integer>(2);

        System.out.println("\n\nRODANDO TESTE ARRAY QUEUE\n");

        System.out.println("Tamanho antes do PUSH: " + queue.size());

        queue.push(10);
        queue.push(20);

        System.out.println("Primeiro:" + queue.peek());
        System.out.println("Ultimo:" + queue.back());
        System.out.println("Tamanho: " + queue.size());

        System.out.println("\n\nTamanho antes do POP: " + queue.size());
        queue.pop();

        System.out.println("Primeiro:" + queue.peek());
        System.out.println("Ultimo:" + queue.back());
        System.out.println("Tamanho: " + queue.size());
    }

}
