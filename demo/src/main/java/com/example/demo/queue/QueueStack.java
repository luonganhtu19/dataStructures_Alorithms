package com.example.demo.queue;

import java.util.Queue;
import java.util.Stack;

public class QueueStack {
    static class Queue{
        static Stack<String> stack1 = new Stack<String>();
        static Stack<String> stack2 = new Stack<String>();

        static void enQueue(String input){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(input);
            while (!stack2.isEmpty())
            {
                stack1.push(stack2.pop());
            }
        }
        static String deQueue()
        {
            if (stack1.isEmpty())
            {
                System.out.println("Q is Empty");
                System.exit(0);
            }
            String input   = stack1.peek();
            stack1.pop();
            return input ;
        }
    }
    public static void main(String[] args)
    {
        Queue q = new Queue();
//        q.enQueue("a");
//        q.enQueue("b");
//        q.enQueue("c");

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}

