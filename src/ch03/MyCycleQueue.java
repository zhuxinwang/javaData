package ch03;

/**
 * 队列
 * 底层为数组
 */
public class MyCycleQueue {

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

    public MyCycleQueue(){
        arr = new int[10];
        element = 0;
        front = 0;
        end= -1;
    }

    public MyCycleQueue(int maxSize){
        arr = new int[maxSize];
        element = 0;
        front = 0;
        end= -1;
    }

    /**
     * 添加数据,从队尾插入
     */
    public void insert(int value){
        if(end == arr.length-1){
            end = -1;
        }
        arr[++end] = value;
        element++;
    }
    /**
     * 删除数据，从队头
     */
    public int remove(){
        int value = arr[front++];
        if(front == arr.length){
            front = 0;
        }
        element--;
        return value;
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
