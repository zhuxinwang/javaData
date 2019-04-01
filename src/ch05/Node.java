package ch05;

/**
 * 链节点
 */
public class Node {
    //数据域
    public int data;
    //指针域
    public Node next;

    public Node(int value){
        this.data = value;
    }

    /**
     * 显示方法
     */
    public void display(){
        System.out.println(data + " ");
    }
}
