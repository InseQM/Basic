package com.codes.java_collections.queue;

import java.util.LinkedList;
import java.util.Objects;

/**
 * LinkedList
 * 1.实现了List接口：是一个List集合，可以根据索引来随机访问集合中的元素
 * 2.实现了Deque接口：可以被当做双端队列来使用，也可以当做“栈”来使用，可以当做队列使用
 * 3.内部以链表的形式来保存集合中的元素，随机访问集合元素时性能较差；
 *  在插入、删除时性能比较出色；
 * 注：Vector使用数组存储集合，但因为实现线程同步的原因，所以各方面性能较差
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList person = new LinkedList();
        person.offer("shawu");
        person.push("sister");
        person.offerFirst("loving");
        for (Object aPerson : person) {
            System.out.println("遍历中：" + aPerson);
        }
        System.out.println(person.peekFirst());
        System.out.println(person.peekLast());
        System.out.println(person.pop());
        System.out.println(person);
        System.out.println(person.pollLast());
    }
}
