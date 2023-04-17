package tests;

import datastructures.linear.*;
import datastructures.nodes.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueLLtest {

    //test for QueueLL constructor
    @Test
    public void testQueueLL() {
        QueueLL<Integer> list = new QueueLL<>();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    //test for QueueLL constructor with node
    @Test
    public void testQueueLL2() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>(node);
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
    }

    //test for enqueue
    @Test
    public void testEnqueue() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>();
        list.enqueue(node);
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
    }

    //test for dequeue
    @Test
    public void testDequeue() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>(node);
        list.dequeue();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    //test for insertHead
    @Test
    public void testInsertHead() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>();
        list.insertHead(node);
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    //test for insert
    @Test
    public void testInsert() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>();
        list.insert(node, 1);
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    //test for delete
    @Test
    public void testDelete() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>(node);
        list.Delete(node);
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
    }

    //test for deleteHead
    @Test
    public void testDeleteHead() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>(node);
        list.deleteHead();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
        // add some more
        
    }


    //test for deleteTail
    @Test
    public void testDeleteTail() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>(node);
        list.dequeue();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    //test for insertTail
    @Test
    public void testInsertTail() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>();
        list.enqueue(node);
        assertEquals(1, list.getSize());
        assertEquals(node,list.getHead());
        assertEquals(node,list.getTail());
    }

    //test for sort
    @Test
    public void testSort() {
        DNode<Integer> node = new DNode<>(1);
        QueueLL<Integer> list = new QueueLL<>(node);
        list.sort();
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
    }
    

    
}
