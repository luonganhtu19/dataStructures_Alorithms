package com.example.demo;

import java.util.LinkedList;

public class DemoTest {
    public static void main(String[] args) {
        int sum =0;
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("a");

//        System.out.println(linkedList.get(4));
        System.out.println(linkedList.getLast() +" :" + linkedList.getFirst());
        System.out.println(linkedListDemo.size());
        linkedListDemo.addLast("a5");
        linkedListDemo.addFirst("a1");
        linkedListDemo.addFirst("a2");
        linkedListDemo.addFirst("a3");
        linkedListDemo.addLast("a4");
        linkedListDemo.insert("a7",4);
        System.out.println(linkedListDemo.size());
        linkedListDemo.print();
        linkedListDemo.removeAt(5);
//        System.out.println(linkedListDemo.head.next.item);
//        System.out.println((101 >>1) + "ammm");
        System.out.println(linkedListDemo.size());
        linkedListDemo.print();
    }
}
