package com.codecool.SinglyLinked;

public class SinglyLinkedList {

    SNode head;
    SNode last;
    int size;

    public SinglyLinkedList() {
    }

    public SinglyLinkedList(SNode node) {
        this.head = node;
        this.size = 1;
    }

    public SNode getHead() {
        return head;
    }

    public void setHead(SNode head) {
        this.head = head;
    }

    public SNode getLast() {
        return last;
    }

    public void setLast(SNode last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
