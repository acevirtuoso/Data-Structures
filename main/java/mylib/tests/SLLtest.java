package tests;

import datastructures.linear.*;
import datastructures.nodes.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SLLtest{

    //test default constructor
    @Test
    public void testDefaultConstructor() {
        SLL<Integer> list = new SLL<Integer>();
        assertEquals(null, list.getHead());
        assertEquals(null, list.getTail());
        assertEquals(0, list.getSize());
    }

    //test overloaded constructor
    @Test
    public void testOverloadedConstructor() {
        DNode<Integer> node = new DNode<Integer>(1);
        SLL<Integer> list = new SLL<Integer>(node);
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
        assertEquals(1, list.getSize());
    }

    //test insertHead
    @Test
    public void testInsertHead() {
        DNode<Integer> node = new DNode<Integer>(1);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node);
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
        assertEquals(1, list.getSize());
    }

    //test insertTail
    @Test
    public void testInsertTail() {
        DNode<Integer> node = new DNode<Integer>(1);
        SLL<Integer> list = new SLL<Integer>();
        list.insertTail(node);
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
        assertEquals(1, list.getSize());
    }

    //test insert
    @Test
    public void testInsert() {
        DNode<Integer> node = new DNode<Integer>(1);
        SLL<Integer> list = new SLL<Integer>();
        list.insert(node, 0);
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
        assertEquals(1, list.getSize());
    }

    //test insertHead with multiple nodes
    @Test
    public void testInsertHeadMultiple() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        assertEquals(node3, list.getHead());
        assertEquals(node1, list.getTail());
        assertEquals(3, list.getSize());
    }


    //test insertTail with multiple nodes
    @Test
    public void testInsertTailMultiple() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertTail(node1);
        list.insertTail(node2);
        list.insertTail(node3);
        assertEquals(node1, list.getHead());
        assertEquals(node3, list.getTail());
        assertEquals(3, list.getSize());
    }


    //test insert with multiple nodes
    @Test
    public void testInsertMultiple() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insert(node1, 0);
        list.insert(node2, 1);
        list.insert(node3, 2);
        assertEquals(node1, list.getHead());
        assertEquals(node3, list.getTail());
        assertEquals(3, list.getSize());
    }


    //test sortedInsert
    @Test
    public void testSortedInsert() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.sortedInsert(node3);
        list.sortedInsert(node1);
        list.sortedInsert(node2);
        assertEquals(node1, list.getHead());
        assertEquals(node3, list.getTail());
        assertEquals(3, list.getSize());
    }


    //test sortedInsert with multiple nodes
    @Test
    public void testSortedInsertMultiple() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        DNode<Integer> node4 = new DNode<Integer>(4);
        DNode<Integer> node5 = new DNode<Integer>(5);
        DNode<Integer> node6 = new DNode<Integer>(6);
        SLL<Integer> list = new SLL<Integer>();
        list.sortedInsert(node3);
        list.sortedInsert(node1);
        list.sortedInsert(node2);
        list.sortedInsert(node6);
        list.sortedInsert(node4);
        list.sortedInsert(node5);
        assertEquals(node1, list.getHead());
        assertEquals(node6, list.getTail());
        assertEquals(6, list.getSize());
    }


    //test search
    @Test
    public void testSearch() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        assertEquals(node2, list.search(node2));
    }

    //test search with multiple nodes
    @Test
    public void testSearchMultiple() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        DNode<Integer> node4 = new DNode<Integer>(4);
        DNode<Integer> node5 = new DNode<Integer>(5);
        DNode<Integer> node6 = new DNode<Integer>(6);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.insertHead(node4);
        list.insertHead(node5);
        list.insertHead(node6);
        assertEquals(node4, list.search(node4));
    }


    //test deleteHead
    @Test
    public void testDeleteHead() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.deleteHead();
        assertEquals(node2, list.getHead());
        assertEquals(node1, list.getTail());
        assertEquals(2, list.getSize());
    }

    //test deleteHead with multiple nodes
    @Test
    public void testDeleteHeadMultiple() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        DNode<Integer> node4 = new DNode<Integer>(4);
        DNode<Integer> node5 = new DNode<Integer>(5);
        DNode<Integer> node6 = new DNode<Integer>(6);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.insertHead(node4);
        list.insertHead(node5);
        list.insertHead(node6);
        list.deleteHead();
        assertEquals(node5, list.getHead());
        assertEquals(node1, list.getTail());
        assertEquals(5, list.getSize());
    }

    //test deleteTail
    @Test
    public void testDeleteTail() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.deleteTail();
        assertEquals(node3, list.getHead());
        assertEquals(node2, list.getTail());
        assertEquals(2, list.getSize());
    }

    //test deleteTail with multiple nodes
    @Test
    public void testDeleteTailMultiple() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        DNode<Integer> node4 = new DNode<Integer>(4);
        DNode<Integer> node5 = new DNode<Integer>(5);
        DNode<Integer> node6 = new DNode<Integer>(6);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.insertHead(node4);
        list.insertHead(node5);
        list.insertHead(node6);
        list.deleteTail();
        assertEquals(node6, list.getHead());
        assertEquals(node2, list.getTail());
        assertEquals(5, list.getSize());
    }

    //test delete
    @Test
    public void testDelete() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.Delete(node2);
        assertEquals(node3, list.getHead());
        assertEquals(node1, list.getTail());
        assertEquals(2, list.getSize());
    }

    //test delete with multiple nodes
    @Test
    public void testDeleteMultiple() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        DNode<Integer> node4 = new DNode<Integer>(4);
        DNode<Integer> node5 = new DNode<Integer>(5);
        DNode<Integer> node6 = new DNode<Integer>(6);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.insertHead(node4);
        list.insertHead(node5);
        list.insertHead(node6);
        list.Delete(node4);
        assertEquals(node6, list.getHead());
        assertEquals(node1, list.getTail());
        assertEquals(5, list.getSize());
    }

    // test sort
    @Test
    public void testSort() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        DNode<Integer> node4 = new DNode<Integer>(4);
        DNode<Integer> node5 = new DNode<Integer>(5);
        DNode<Integer> node6 = new DNode<Integer>(6);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node6);
        list.insertHead(node2);
        list.insertHead(node1);
        list.insertHead(node4);
        list.insertHead(node5);
        list.insertHead(node3);
        list.sort();
        assertEquals(node1, list.getHead());
        assertEquals(node6, list.getTail());
        assertEquals(6, list.getSize());
    }

    //test clear
    @Test
    public void testClear() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.clear();
        assertEquals(null, list.getHead());
        assertEquals(null, list.getTail());
        assertEquals(0, list.getSize());
    }

    //test clear with multiple nodes
    @Test
    public void testClearMultiple() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        DNode<Integer> node4 = new DNode<Integer>(4);
        DNode<Integer> node5 = new DNode<Integer>(5);
        DNode<Integer> node6 = new DNode<Integer>(6);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.insertHead(node4);
        list.insertHead(node5);
        list.insertHead(node6);
        list.clear();
        assertEquals(null, list.getHead());
        assertEquals(null, list.getTail());
        assertEquals(0, list.getSize());
    }


    //test print
    @Test
    public void testPrint() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.print();
        assertEquals(node3, list.getHead());
        assertEquals(node1, list.getTail());
        assertEquals(3, list.getSize());
    }

    //test the setter and getter for head
    @Test
    public void testSetGetHead() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.setHead(node2);
        assertEquals(node2, list.getHead());
    }


    //test the setter and getter for tail
    @Test
    public void testSetGetTail() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.setTail(node2);
        assertEquals(node2, list.getTail());
    }


    //test for the setter and getter for size
    @Test
    public void testSetGetSize() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        list.setSize(3);
        assertEquals(3, list.getSize());
    }

    //test for get last node
    @Test
    public void testGetLastNode() {
        DNode<Integer> node1 = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        SLL<Integer> list = new SLL<Integer>();
        list.insertHead(node1);
        list.insertHead(node2);
        list.insertHead(node3);
        assertEquals(node1, list.getLastNode());
    }





}
