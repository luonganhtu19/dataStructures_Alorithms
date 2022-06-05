package com.example.demo;

import java.lang.annotation.Target;

public class LinkedListDemo {
    class Node {
        String item;
        Node next;
        Node prev;
    }

    Node head;
    Node tail;
    int size = 0;
    public int size() {
        this.size =0;
        Node tmpNode = this.head;
        while (tmpNode!=null){
            size++;
            tmpNode=tmpNode.next;
        }
        return size;
    };


    public boolean isEmpty() {
        if (this.head!=null){
         return false;
        }else {
            return true;
        }
    }

    public Node getFirst() {
        return this.head;
    }

    public Node getLast() {
        return this.tail;
    }

    public void addFirst(String item) {
        Node tmpNode = new Node();
        if (head==null){
            tmpNode.item = item;
            this.head = tmpNode;
            this.tail = tmpNode;
        }else {
            tmpNode = this.head;
            this.head = new Node();
            this.head.item = item;
            this.head.next = tmpNode;
            this.head.next.prev = this.head;
        }
    }

    public void insert(String item, int index) {
        this.size =size();
        if (size<index){
            System.out.println("index not exist");
        } else if(size() == index) {
            addLast(item);
        } else {
            Node indexNode =getPointerTo(index);
            Node pred = indexNode.prev;
            Node newNode = new Node();
            newNode.prev = pred;
            newNode.item = item;
            newNode.next = indexNode;
            if (pred == null)
                this.head = newNode;
            else {
                pred.next = newNode;
                indexNode.prev = newNode;
            }
        }
    }

    public void addLast(String item) {
        Node tmpNode = new Node();
        tmpNode.item = item;
        if (head==null ){
            this.head = tmpNode;
            this.tail = tmpNode;
        }else {
            this.tail.next = tmpNode;
            Node tailPrev = this.tail;
            this.tail =tmpNode;
            this.tail.prev = tailPrev;
        }
    }

    public void  removeFirst() {
        if (size()==0||size()==1){
            this.head = null;
            this.tail = null;
        }else {
            Node tmp = this.head.next;
            this.head = tmp;
            tmp.prev =null;
        }
    }

    public boolean removeAt(int index) {
        if (index>size()){
            return false;
        } else if (index==0){
            removeFirst();
            return true;
        } else if (index == size()-1){
            Node tmp = new Node();
            tmp = this.tail;
            this.tail =tmp.prev;
            this.tail.next =null;
            return true;
        }
        else {
            Node tmp = getPointerTo(index);
            Node pred = tmp.prev;
            Node next = tmp.next;
            pred.next = next;
            next.prev = pred;
            return true;
        }
    }

    private Node getPointerTo(int index) {
        this.size = size();
        if (index < (size >> 1)){
            Node x = this.head;
            for (int i =0; i<index;i++)
                x = x.next;
            return x;
        }else {
            Node x = tail;
            for (int i = size -1;i>index;i--)
                x = x.prev;
            return x;
        }
    }

    public void print() {
        Node current = head;
        System.out.print("_" + (head!=null)+" _");

        while (current != null) {
            System.out.print(current.item+ ",");
            current = current.next;
        }

        System.out.println("_");
    }
}
