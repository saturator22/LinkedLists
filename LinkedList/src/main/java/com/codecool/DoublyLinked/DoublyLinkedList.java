package com.codecool.DoublyLinked;

public class DoublyLinkedList<T> {

    DNode<T> head;
    DNode<T> last;
    int size;

    public DoublyLinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }
    //removes first node
    public void remove() {
        DNode temp = this.head.getNext();
        this.head = temp;
        this.size--;
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Index is bigger than list length or lower than 0");
        } else if(index == 0) {
            remove();
            this.size++;
        } else if(index == size - 1) {
            DNode newLast = getNode(index - 1);
            newLast.setNext(null);
            setLast(newLast);
        } else {
            DNode beforeToRemove = getNode(index - 1);
            DNode toRemove = beforeToRemove.getNext();
            DNode toRemoveTail = toRemove.getNext();

            toRemoveTail.setPrevious(beforeToRemove);
            beforeToRemove.setNext(toRemoveTail);
        }
        this.size--;
    }

    public void insert(DNode<T> node, int index) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("Index is bigger than list length or lower than 0");
        } else if(index == 0) {
            head.setPrevious(node);
            node.setNext(head);
            this.head = node;
        } else if(index == size) {
            node.setPrevious(getLast());
            getLast().setNext(node);
            setLast(node);
        } else {
            DNode current = getNode(index-1);
            node.setPrevious(current);
            node.setNext(current.getNext());
            current.getNext().setPrevious(node);
            current.setNext(node);
        }
        this.size++;
    }

    public DNode getNode(int index) {
        DNode current = this.head;

        for(int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return  current;
    }

    public void append(DNode<T> node) {
        if(size == 0) {
            setHead(node);
            setLast(node);
        } else {
            node.setPrevious(getLast());
            getLast().setNext(node);
            setLast(node);
        }
        this.size++;
    }

    public DNode<T> getHead() {
        return head;
    }

    public void setHead(DNode<T> head) {
        this.head = head;
    }

    public DNode<T> getLast() {
        return last;
    }

    public void setLast(DNode<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
