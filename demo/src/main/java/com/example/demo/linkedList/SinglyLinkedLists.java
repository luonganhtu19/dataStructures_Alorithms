package com.example.demo.linkedList;

import java.util.LinkedList;

public class SinglyLinkedLists {
        Node head; // head of the list

        /* Linked list Node*/
        static class Node {
            int data;
            Node next;

            // Constructor to create a new node
            // Next is by default initialized
            // as null
            Node(int d) {
                data = d;
                next = null;
            }

            @Override
            public String toString() {
                return "Node{" +
                        "data=" + data +
                        ", next=" + next +
                        '}';
            }
        }

    @Override
    public String toString() {
        return "SinglyLinkedLists{" +
                "head=" + head +
                '}';
    }

    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        SinglyLinkedLists linkedList = new SinglyLinkedLists();
        linkedList.head = new Node(1);
        Node sec = new Node(2);
        Node third = new Node(3);
        System.out.printf(linkedList.toString());
    }
}
