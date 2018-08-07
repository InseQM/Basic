package com.codes.java_collections.queue;

import java.util.ArrayDeque;

/**
 * Deque接口 双端队列；底层数组长度为16
 * ArrayDeque实现类：基于数组实现的双端队列；和ArrayList实现机制基本相似
 * ArrayDeque当成“栈”来使用
 */
public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        stack.push("shawu");
        stack.push("sister");
        stack.push("love");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.poll());
        System.out.println(stack);
    }
}
