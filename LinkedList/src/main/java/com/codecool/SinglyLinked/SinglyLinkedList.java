package com.codecool.SinglyLinked;

public class SinglyLinkedList<T> {

    SNode<T> head;
    SNode<T> last;
    int size;

    public SinglyLinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

//    Removes first node of the list
    public void remove() {
        SNode temp = this.head.getNext();
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
            SNode newLast = getNode(index - 1);
            newLast.setNext(null);
            setLast(newLast);
        } else {
            SNode beforeToRemove = getNode(index - 1);
            SNode toRemove = beforeToRemove.getNext();
            SNode toRemoveTail = toRemove.getNext();

            beforeToRemove.setNext(toRemoveTail);
        }
        this.size--;
    }

    public void append(SNode<T> node) {
        if(size == 0) {
            setHead(node);
            setLast(node);
        } else {
            getLast().setNext(node);
            setLast(node);
        }
        this.size++;
    }

    public void insert(SNode<T> node, int index) {
        if (index > size || index < 0) {
            throw new IllegalArgumentException("Index is bigger than list length or lower than 0");
        } else if(index == 0) {
            node.setNext(head);
            this.head = node;
        } else if(index == size) {
            getLast().setNext(node);
            setLast(node);
        } else {
            SNode current = getNode(index-1);
            node.setNext(current.getNext());
            current.setNext(node);
        }
        this.size++;
    }

    public SNode getNode(int index) {
        SNode current = this.head;

        for(int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return  current;
    }

    public SNode<T> getHead() {
        return head;
    }

    public void setHead(SNode<T> head) {
        this.head = head;
    }

    public SNode<T> getLast() {
        return last;
    }

    public void setLast(SNode<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
