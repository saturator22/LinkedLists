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

        assertEquals("third", singlyLinkedList.getNode(2).getData());
        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.insert(testNode, -1));
    }

    @Test
    public void testLast() {
        SNode testNode = new SNode("first");
        SNode testNode2 = new SNode("second");
        SNode testNode3 = new SNode("third");

        singlyLinkedList.append(testNode);
        singlyLinkedList.append(testNode3);
        singlyLinkedList.append(testNode2);

        assertEquals(testNode2, singlyLinkedList.getLast());
    }

    @Test
    public void testSize() {
        singlyLinkedList.append(new SNode<>("KSZKS"));

        assertEquals(2, singlyLinkedList.getSize());
    }

    @Test
    public void testRemoveFirst() {
        singlyLinkedList.append(new SNode<>("NEW"));
        singlyLinkedList.remove();

        assertEquals("NEW", singlyLinkedList.getHead().getData());
    }

    @Test
    public void testRemoveAtIndex() {
        SNode testNode = new SNode("first");
        SNode testNode2 = new SNode("second");
        SNode testNode3 = new SNode("third");

        singlyLinkedList.append(testNode);
        singlyLinkedList.append(testNode3);
        singlyLinkedList.append(testNode2);

        singlyLinkedList.remove(0);
        singlyLinkedList.remove(2);

        assertEquals(2, singlyLinkedList.getSize());
        assertEquals(testNode, singlyLinkedList.getNode(0));
        assertEquals(testNode3, singlyLinkedList.getNode(1));
        assertThrows(IllegalArgumentException.class, () -> singlyLinkedList.remove(23));
    }
}
