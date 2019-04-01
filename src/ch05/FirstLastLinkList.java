package ch05;

import ch04.Node;

/**
 * 双端链表
 */
public class FirstLastLinkList {
    //头结点
    private Node first;

    //尾节点
    private Node last;

    public FirstLastLinkList(){
        first = null;
        last = null;
    }

    /**
     * 1.插入一个结点，在头结点后进行插入
     * @param value 需要插入的值
     */
    public void insertFirst(int value){
        Node node = new Node(value);
        if(isEmpty()){
            last = node;
        }
        node.next = first;
        first = node;
    }

    /**
     * 插入一个结点，从尾节点掺入
     */
    public void insertLast(int value){
        Node node = new Node(value);
        if(isEmpty()){
            first = node;
        }else{
            last.next = node;
        }
        last = node;
    }

    /**
     * 2.删除一个结点，在头结点之后
     */
    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){
            last = null;
        }
        first = temp.next;
        return temp;
    }

    /**
     * 3.显示方法
     */
    public void display(){
        Node current = first;
        while (current != null){
            current.display();
            current = current.next;
        }
    }

    /**
     * 4查找方法
     */
    public Node find(int value){
        Node current = first;
        while (current.data != value){
            if(current.next == null){
                return null;
            }
            current = current.next;
        }
        return current;
    }

    /**
     * 5.删除方法
     */
    public Node delete(int value){
        Node current = first;
        Node previous = first;
        while (current.data != value){
            if(current.next == null){
                return null;
            }
            previous = current;
            current = current.next;
        }
        if(current == first){
            first = first.next;
        }else{
            previous.next = current.next;
        }
        return current;
    }

    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return first == null;
    }
}
