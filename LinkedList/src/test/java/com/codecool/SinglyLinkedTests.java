package com.codecool;

import static org.junit.jupiter.api.Assertions.*;

import com.codecool.SinglyLinked.SNode;
import com.codecool.SinglyLinked.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class SinglyLinkedTests {
    SinglyLinkedList<String> singlyLinkedList;

    @BeforeEach
    public void setup() {
        this.singlyLinkedList = new SinglyLinkedList();
        SNode<String> node = new SNode("ELO");
        singlyLinkedList.append(node);
    }

    @Test
    public void testHead() {
        SNode<String> nod = singlyLinkedList.getHead();

        String data = nod.getData();

        String nodeData = singlyLinkedList.getHead().getData();
        assertEquals("ELO", nodeData);
    }

    @Test
    public void testTail() {
        SNode tail = new SNode("tail");
        SNode head = singlyLinkedList.getHead();

        head.setNext(tail);

        assertEquals("tail", tail.getData());
    }

    @Test
    public void testInsert() {
        SNode testNode = new SNode("first");
        SNode testNode2 = new SNode("second");
        SNode testNode3 = new SNode("third");
        singlyLinkedList.insert(testNode, 1);
        singlyLinkedList.insert(testNode2, 2);
        singlyLinkedList.insert(testNode3, 2);

        assertEquals(4, singlyLinkedList.getSize());
        assertEquals("third", singlyLinkedList.getNode(2).getData());
        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.insert(testNode, -1));
    }
}
