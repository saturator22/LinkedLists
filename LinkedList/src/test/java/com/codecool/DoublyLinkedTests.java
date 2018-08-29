package com.codecool;

import com.codecool.DoublyLinked.DNode;
import com.codecool.DoublyLinked.DoublyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedTests {

    DoublyLinkedList<Integer> doublyLinkedList;

    @BeforeEach
    public void setup() {
        this.doublyLinkedList = new DoublyLinkedList<>();
        DNode<Integer> node = new DNode(0);
        doublyLinkedList.append(node);
    }

    @Test
    public void testHead() {
        Integer nodeData = doublyLinkedList.getHead().getData();

        assertEquals(new Integer(0), Integer.valueOf(nodeData));
    }

    @Test
    public void testInsert() {
        DNode node = new DNode(1);
        DNode node2 = new DNode(2);
        DNode node3 = new DNode(3);

        this.doublyLinkedList.insert(node, 0);
        this.doublyLinkedList.insert(node2, 2);
        this.doublyLinkedList.insert(node3, 1);

        assertAll("Testing inserts: ",
                () -> assertEquals(node, doublyLinkedList.getNode(0)),
                () -> assertEquals(node3, node2.getPrevious().getPrevious()),
                () -> assertEquals(node2, doublyLinkedList.getLast())
        );
    }

    @Test
    public void testSize() {
        assertEquals(1, this.doublyLinkedList.getSize());
    }

    @Test
    public void testPrevious() {
        DNode node = new DNode(1);
        DNode node2 = new DNode(2);
        DNode node3 = new DNode(3);

        this.doublyLinkedList.insert(node, 0);
        this.doublyLinkedList.insert(node2, 2);
        this.doublyLinkedList.append(node3);

        assertEquals(0, node2.getPrevious().getData());
        assertEquals(node2, node3.getPrevious());
    }

    @Test
    public void testRemoveFirst() {
        doublyLinkedList.append(new DNode<>(1));
        doublyLinkedList.remove();

        assertEquals(new Integer(1), doublyLinkedList.getHead().getData());
    }

    @Test
    public void testRemoveAtIndex() {
        DNode testNode = new DNode(1);
        DNode testNode2 = new DNode(2);
        DNode testNode3 = new DNode(3);

        doublyLinkedList.append(testNode);
        doublyLinkedList.append(testNode3);
        doublyLinkedList.append(testNode2);

        doublyLinkedList.remove(0);
        doublyLinkedList.remove(2);

        assertEquals(2, doublyLinkedList.getSize());
        assertEquals(testNode, doublyLinkedList.getNode(0));
        assertEquals(testNode3, doublyLinkedList.getNode(1));
        assertThrows(IllegalArgumentException.class, () -> doublyLinkedList.remove(23));
    }
}
