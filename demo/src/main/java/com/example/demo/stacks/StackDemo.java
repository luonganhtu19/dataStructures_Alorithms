package com.example.demo.stacks;
import java.util.EmptyStackException;
        import java.util.LinkedList;

public class StackDemo {
    private int size;

    private int capacity;

    private LinkedList linkedList;


    private int pointer;

    class LinkedList {
        int sizeList;

        private Node first;

        private Node last;

        class Node {
            int item;
            Node next;
            Node prev;

            Node(Node prev, int element, Node next) {
                this.item = element;
                this.next = next;
                this.prev = prev;
            }
        }
        boolean isListEmpty(){
            return sizeList == 0;
        }
        void addLast(int e) {
            final Node l = last;
            final Node newNode = new Node(l, e, null);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            sizeList++;
        }
        void deleteLast() {
            if(sizeList == 0) {
                return;
            }
            final Node prev = last.prev;
            prev.next = null;
            sizeList--;
        }
        int getLast() {
            if(isListEmpty()) {
                return -1;
            }
            return last.item;
        }
        void print() {
            Node i = first;
            while (i != null) {
                System.out.println(i.item);
                i = i.next;
            }
        }
    }

    public StackDemo() {
        linkedList = new LinkedList();
    }

    public boolean isFull(){
        return false;
    }

    public boolean isEmpty(){
        return linkedList.isListEmpty();
    }

    public void push(int item) {
        if(this.isFull()){
            throw new StackOverflowError();
        }
        linkedList.addLast(item);
    }

    public void pop() {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
        linkedList.deleteLast();
    }

    public int top() {
        return linkedList.getLast();
    }

    public int size(){
        return linkedList.sizeList;
    }

    public void print() {
        linkedList.print();
    }

    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();
        System.out.println(stackDemo.isEmpty());
        stackDemo.push(1);
//        stackDemo.push(2);
//        stackDemo.push(3);
//        stackDemo.push(4);
//        stackDemo.push(5);
        stackDemo.pop();
//        stackDemo.push(6);
//        stackDemo.print();
//        System.out.println(stackDemo.size());
//        System.out.println(stackDemo.isFull());
//        stackDemo.push(5);
//
//        stackDemo.pop();
//        stackDemo.print();
//        System.out.println(stackDemo.size());
    }
}

