package ch03;

/**
 * 栈
 * 底层实现是一个数组
 */
public class MyStack {
    private int[] arr;
    private int top;

    public MyStack(){
        arr = new int[10];
        top = -1;
    }

    public MyStack(int maxSize){
        arr = new int[maxSize];
        top = -1;
    }

    /**
     * 添加数据
     */
    public void push(int value){
        arr[++top] = value;
    }

    /**
     * 移除数据
     */
    public int pop(){
        return arr[top--];
    }

    /**
     * 查看数组
     */
    public int peek(){
        return arr[top];
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return  top == -1;
    }

    /**
     * 判断是否满了
     */
    public boolean isFull(){
        return top == arr.length-1;
    }

    public void toStr(){
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
        System.out.println();
    }
}
