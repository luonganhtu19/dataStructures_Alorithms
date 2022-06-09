package com.example.demo.queue;

public class QueueDemo {

    int size;

    private LinkedList linkedList;

    public QueueDemo() {
        linkedList = new LinkedList();
    }

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
        int deleteFirst() {
            if(isListEmpty()) {
                return -1;
            }
            int item = first.item;
            final Node next = first.next;
            first = next;
            size--;
            return item;
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

    public void enQueue(int item) {
        linkedList.addLast(item);
    }

    public int deQueue() {
        return linkedList.deleteFirst();
    }

    public boolean isEmpty(){
        return linkedList.isListEmpty();
    }

    public int front() {
        return linkedList.first.item;
    }

    public void print(){
        linkedList.print();
    }

    public int getSize() {
        return linkedList.sizeList;
    }

    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();
        queue.getSize();
//        queue.deQueue();

//        System.out.println(queue.front());
//        System.out.println(queue.getSize());
        queue.enQueue(1);
//        queue.enQueue(2);
//        queue.enQueue(3);
//        queue.enQueue(4);
//        queue.enQueue(5);
//        queue.print();
        queue.deQueue();
//        queue.print();
//        System.out.println(queue.front());
        System.out.println("size: " + queue.getSize());
    }
}

