package com.codecool.DoublyLinked;


public class DNode<T> {
    T data;
    DNode<T> next;
    DNode<T> previous;

    public DNode() {
    }

    public DNode(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }

    public DNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DNode<T> previous) {
        this.previous = previous;
    }
}
