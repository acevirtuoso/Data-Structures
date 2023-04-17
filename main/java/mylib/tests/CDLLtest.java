package tests;

import datastructures.linear.*;
import datastructures.nodes.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class CDLLtest {
    
    //test for CDLL constructor
    @Test
    public void testCDLL() {
        CDLL<Integer> list = new CDLL<>();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    @Test
    public void testCDLL2() {
        DNode<Integer> node = new DNode<>(1);
        CDLL<Integer> list = new CDLL<>(node, node);
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
    }

    //test for insertHead
    @Test
    public void testInsertHead() {
        DNode<Integer> node = new DNode<>(1);
        CDLL<Integer> list = new CDLL<>();
        list.insertHead(node);
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
    }

    //test for insertTail
    @Test
    public void testInsertTail() {
        DNode<Integer> node = new DNode<>(1);
        CDLL<Integer> list = new CDLL<>();
        list.insertTail(node);
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
    }

    //test for insert takes one node and one position
    @Test
    public void testInsert() {
        DNode<Integer> node = new DNode<>(1);
        DNode<Integer> node2 = new DNode<>(2);
        CDLL<Integer> list = new CDLL<>();
        list.insert(node, 0);
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
        list.insert(node2, 1);
        assertEquals(2, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node2, list.getTail());
    }

    //test for delete
    @Test
    public void testDelete() {
        DNode<Integer> node = new DNode<>(1);
        CDLL<Integer> list = new CDLL<>(node, node);
        list.Delete(node);
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    //test for deleteHead
    @Test
    public void testDeleteHead() {
        DNode<Integer> node = new DNode<>(1);
        CDLL<Integer> list = new CDLL<>(node, node);
        list.deleteHead();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    // //test for sort
    // @Test
    // public void testSort() {
    //     DNode<Integer> node = new DNode<>(1);
    //     DNode<Integer> node2 = new DNode<>(2);
    //     CDLL<Integer> list = new CDLL<>();
    //     list.insert(node, 0);
    //     list.insert(node2, 1);
    //     list.sort();
    //     assertEquals(2, list.getSize());
    //     assertEquals(node, list.getHead());
    //     assertEquals(node2, list.getTail());
    // }

    
    
}
