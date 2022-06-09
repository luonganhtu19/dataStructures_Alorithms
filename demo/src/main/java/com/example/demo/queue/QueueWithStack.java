package com.example.demo.queue;
import java.util.Stack;
import java.util.function.Consumer;

public class QueueWithStack<E> {
    private final Stack<E> head = new Stack<>();
    private final Stack<E> tail = new Stack<>();
    private State state = State.EnQueue;

    private enum State {
        EnQueue, DeQueue
    }

    private void exchangeStack(Stack to, Stack from){
        while (!to.isEmpty()){
            from.push(to.pop());
        }
    }

    public void enQueue(E item){
        if (state == State.DeQueue) {
            exchangeStack(head,tail);
        }
        state = State.EnQueue;
        tail.push(item);
    }
    public void deQueue(){
        if (state == State.EnQueue) {
            exchangeStack(tail,head);
        }
        state = State.DeQueue;
        head.pop();
    }
    public E peek(){
        if (state == State.EnQueue) {
            exchangeStack(tail,head);
        }
        state = State.DeQueue;
        return head.peek();
    }
    public boolean isFull(){
        return false;
    }
    public boolean isEmpty(){
        return head.isEmpty() && tail.isEmpty();
    }

    public void forEach(Consumer consumer){
        exchangeStack(head,tail);
        state = State.EnQueue;
        tail.forEach(consumer);
    }

    public static void main(String[] args) {
        QueueWithStack<Integer> queue = new QueueWithStack<Integer>();
        QueueWithStack<Integer> queue1 = new QueueWithStack<Integer>();
        queue.forEach(System.out::println);
        queue.enQueue(1);
        queue.deQueue();
        queue.enQueue(2);
        queue.deQueue();
        queue.enQueue(3);
//        queue1.deQueue();
//        queue.forEach(System.out::println);
//        queue.deQueue();



//        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
//        queue.forEach(System.out::println);
        System.out.println("----------------");
        queue1.forEach(System.out::println);
    }
}
