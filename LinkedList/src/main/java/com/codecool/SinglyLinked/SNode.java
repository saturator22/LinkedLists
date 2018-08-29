package com.codecool.SinglyLinked;

public class SNode {
    Object data;
    SNode next;

    public SNode() {
    }

    public SNode(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SNode getNext() {
        return next;
    }

    public void setNext(SNode next) {
        this.next = next;
    }
}
