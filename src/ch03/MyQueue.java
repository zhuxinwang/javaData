package ch03;

/**
 * 队列
 * 底层为数组
 */
public class MyQueue {

    private int[] arr;
    /**
     * 有效数据大小
     */
    private int element;
    /**
     * 队头
     */
    private int front;
    /**
     * 队尾
     */
    private int end;

    public MyQueue(){
        arr = new int[10];
        element = 0;
        front = 0;
        end= -1;
    }

    public MyQueue(int maxSize){
        arr = new int[maxSize];
        element = 0;
        front = 0;
        end= -1;
    }

    /**
     * 添加数据,从队尾插入
     */
    public void insert(int value){
        arr[++end] = value;
        element++;
    }
    /**
     * 删除数据，从队头
     */
    public int remove(){
        element--;
        return arr[front++];
    }

    /**
     * 查看数据
     * @return
     */
    public int peek(){
        return arr[front];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return element == 0;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull(){
        return element == arr.length;
    }
}
