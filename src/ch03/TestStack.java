package ch03;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {

        MyStack ms = new MyStack(4);
        ms.push(23);
        ms.push(12);
        ms.push(1);
        ms.push(90);
        System.out.println(ms.isEmpty());
        System.out.println(ms.isFull());

        System.out.println(ms.peek());
        ms.toStr();
        while (!ms.isEmpty()){
            System.out.println(ms.pop() + ",");
        }
        ms.toStr();
        System.out.println(ms.isEmpty());
        System.out.println(ms.isFull());

        Stack<String> stack = new Stack<>();
        stack.push("zhu");
        stack.push("xin");
        stack.push("wang");
        System.out.println(stack.empty());
        System.out.println(stack.search("zhu"));
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println(stack.empty());
        System.out.println(stack.search("zhu"));
    }
}
