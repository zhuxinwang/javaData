package ch03;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(4);
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
    }
}
