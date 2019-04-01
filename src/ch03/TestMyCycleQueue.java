package ch03;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestMyCycleQueue {
    public static void main(String[] args) {








        MyCycleQueue mq = new MyCycleQueue(4);
        mq.insert(23);
        mq.insert(45);
        mq.insert(13);
        mq.insert(1);

        System.out.println(mq.isEmpty());
        System.out.println(mq.isFull());
        System.out.println(mq.peek());
        while (!mq.isEmpty()){
            System.out.print(mq.remove() + " ");
        }
        System.out.println(mq.isFull());

        mq.insert(623);
        mq.insert(645);
        mq.insert(613);
        mq.insert(61);

        System.out.println(mq.isEmpty());
        System.out.println(mq.isFull());
        System.out.println(mq.peek());
        while (!mq.isEmpty()){
            System.out.print(mq.remove() + " ");
        }
        System.out.println(mq.isFull());
    }
}
