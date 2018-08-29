package com.codecool;

import static org.junit.jupiter.api.Assertions.*;

import com.codecool.SinglyLinked.SNode;
import com.codecool.SinglyLinked.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class SinglyLinkedTests {
    SinglyLinkedList singlyLinkedList;

    @BeforeEach
    public void setup() {
        this.singlyLinkedList = new SinglyLinkedList();
        SNode node = new SNode("ELO");
        singlyLinkedList.setHead(node);
    }

    @Test
    public void testHead() {
        String nodeData = (String) singlyLinkedList.getHead().getData();
        assertEquals("ELO", nodeData);
    }
}
