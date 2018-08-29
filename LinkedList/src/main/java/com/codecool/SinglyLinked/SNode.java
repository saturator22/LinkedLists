package com.codecool.SinglyLinked;

public class SNode<T> {
    T data;
    SNode<T> next;

    public SNode() {
    }

    public SNode(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SNode<T> getNext() {
        return next;
    }

    public void setNext(SNode<T> next) {
        this.next = next;
    }
}
