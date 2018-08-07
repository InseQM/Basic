package com.codes.java_collections.queue;

import java.util.PriorityQueue;

/**
 * PriorityQueue
 * 1.比较标准队列实现：保存队列元素时，按队列元素的大小重新排序，调用peek()和poll()方法时
 *              取出的是队列最小的元素，违反了队列的先进先出规则
 * 2.并没有很好的按照大小顺序排序，只是受到PriorityQueue的toString方法的影响。
 * 3.实际上多次调用poll()方法，可以看到元素按照从小到大的顺序“移出队列”
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
