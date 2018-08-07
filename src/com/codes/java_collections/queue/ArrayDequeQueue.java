package com.codes.java_collections.queue;

import java.util.ArrayDeque;

/**
 * ArrayDeque 当成队列使用
 */
public class ArrayDequeQueue {
    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque();
        queue.offer("shawu");
        queue.offer("sister");
        queue.offer("loving");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.pollLast());
        System.out.println(queue);
    }
}
