package tests;
import datastructures.linear.*;
import datastructures.nodes.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class DLLtest {
    //this test file is for testing the DLL class

    //Test the constructor
    @Test
    public void testConstructor() {
        DLL<Integer> dll = new DLL<Integer>();
        assertEquals(0, dll.getSize());
        assertEquals(null, dll.getHead());
        assertEquals(null, dll.getTail());
    }

    //test the overloaded constructor
    @Test
    public void testOverloadedConstructor() {
        DNode<Integer> node = new DNode<Integer>(1);
        DNode<Integer> node2 = new DNode<Integer>(2);
        DLL<Integer> dll = new DLL<Integer>(node, node2);
        assertEquals(0, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node2, dll.getTail());
    }

    //Test the insertHead method
    @Test
    public void testInsertHead() {
        DLL<Integer> dll = new DLL<Integer>();
        DNode<Integer> node = new DNode<Integer>(1);
        dll.insertHead(node);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test inserting a second node
        DNode<Integer> node2 = new DNode<Integer>(2);
        dll.insertHead(node2);
        assertEquals(2, dll.getSize());
        assertEquals(node2, dll.getHead());
        assertEquals(node, dll.getTail());
        //test inserting a third node
        DNode<Integer> node3 = new DNode<Integer>(3);
        dll.insertHead(node3);
        assertEquals(3, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node, dll.getTail());
    }

    //Test the insertTail method
    @Test
    public void testInsertTail() {
        DLL<Integer> dll = new DLL<Integer>();
        DNode<Integer> node = new DNode<Integer>(1);
        dll.insertTail(node);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test inserting a second node
        DNode<Integer> node2 = new DNode<Integer>(2);
        dll.insertTail(node2);
        assertEquals(2, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node2, dll.getTail());
        //test inserting a third node
        DNode<Integer> node3 = new DNode<Integer>(3);
        dll.insertTail(node3);
        assertEquals(3, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node3, dll.getTail());
    }

    //Test the insert method
    @Test
    public void testInsert() {
        DLL<Integer> dll = new DLL<Integer>();
        DNode<Integer> node = new DNode<Integer>(1);
        dll.insert(node, 0);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test inserting a second node
        DNode<Integer> node2 = new DNode<Integer>(2);
        dll.insert(node2, 1);
        assertEquals(2, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node2, dll.getTail());
        //test inserting a third node
        DNode<Integer> node3 = new DNode<Integer>(3);
        dll.insert(node3, 1);
        assertEquals(3, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node2, dll.getTail());
        //test inserting a fourth node
        DNode<Integer> node4 = new DNode<Integer>(4);
        dll.insert(node4, 2);
        assertEquals(4, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node2, dll.getTail());
        //test inserting a fifth node
        DNode<Integer> node5 = new DNode<Integer>(5);
        dll.insert(node5, 0);
        assertEquals(5, dll.getSize());
        assertEquals(node5, dll.getHead());
        assertEquals(node2, dll.getTail());
    }

    //Test the deleteHead method
    @Test
    public void testDeleteHead() {
        DLL<Integer> dll = new DLL<Integer>();
        DNode<Integer> node = new DNode<Integer>(1);
        dll.insertHead(node);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the head
        dll.deleteHead();
        assertEquals(0, dll.getSize());
        assertNull(dll.getHead());
        assertNull(dll.getTail());
        //test deleting the head of a list with multiple nodes
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        dll.insertHead(node);
        dll.insertHead(node2);
        dll.insertHead(node3);
        assertEquals(3, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the head
        dll.deleteHead();
        assertEquals(2, dll.getSize());
        assertEquals(node2, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the head
        dll.deleteHead();
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the head
        dll.deleteHead();
        assertEquals(0, dll.getSize());
        assertNull(dll.getHead());
        assertNull(dll.getTail());
    }

    //Test the deleteTail method
    @Test
    public void testDeleteTail() {
        DLL<Integer> dll = new DLL<Integer>();
        DNode<Integer> node = new DNode<Integer>(1);
        dll.insertHead(node);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the tail
        dll.deleteTail();
        assertEquals(0, dll.getSize());
        assertNull(dll.getHead());
        assertNull(dll.getTail());
        //test deleting the tail of a list with multiple nodes
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        dll.insertHead(node);
        dll.insertHead(node2);
        dll.insertHead(node3);
        assertEquals(3, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the tail
        dll.deleteTail();
        assertEquals(2, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node2, dll.getTail());
        //test deleting the tail
        dll.deleteTail();
        assertEquals(1, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node3, dll.getTail());
        //test deleting the tail
        dll.deleteTail();
        assertEquals(0, dll.getSize());
        assertNull(dll.getHead());
        assertNull(dll.getTail());
    }


    //Test the delete method
    @Test
    public void testDelete() {
        DLL<Integer> dll = new DLL<Integer>();
        DNode<Integer> node = new DNode<Integer>(1);
        dll.insertHead(node);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the head
        dll.Delete(node);
        assertEquals(0, dll.getSize());
        assertNull(dll.getHead());
        assertNull(dll.getTail());
        //test deleting the tail of a list with multiple nodes
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        dll.insertHead(node);
        dll.insertHead(node2);
        dll.insertHead(node3);
        assertEquals(3, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the tail
        dll.Delete(node2);
        assertEquals(2, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the head
        dll.Delete(node3);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the head
        dll.Delete(node);
        assertEquals(0, dll.getSize());
        assertNull(dll.getHead());
        assertNull(dll.getTail());
    }


    //test clear method
    @Test
    public void testClear() {
        DLL<Integer> dll = new DLL<Integer>();
        DNode<Integer> node = new DNode<Integer>(1);
        dll.insertHead(node);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the head
        dll.clear();
        assertEquals(0, dll.getSize());
        assertNull(dll.getHead());
        assertNull(dll.getTail());
        //test deleting the tail of a list with multiple nodes
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        dll.insertHead(node);
        dll.insertHead(node2);
        dll.insertHead(node3);
        assertEquals(3, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the tail
        dll.clear();
        assertEquals(0, dll.getSize());
        assertNull(dll.getHead());
        assertNull(dll.getTail());
    }

    //test the sort method
    @Test
    public void testSort() {
        DLL<Integer> dll = new DLL<Integer>();
        DNode<Integer> node = new DNode<Integer>(1);
        dll.insertHead(node);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the head
        dll.sort();
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());
        dll.clear();
        //test deleting the tail of a list with multiple nodes
        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        dll.insertHead(node);
        dll.insertHead(node2);
        dll.insertHead(node3);
        assertEquals(3, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node, dll.getTail());
        //test deleting the tail
        dll.sort();
        assertEquals(3, dll.getSize());
        // assertEquals(node.getData(), dll.getHead().getData());
        assertEquals(node3, dll.getTail());
    }

    //test the sortedInsert
    @Test
    public void testSortedInsert() {
        DLL<Integer> dll = new DLL<Integer>();
        DNode<Integer> node = new DNode<Integer>(1);
        DNode<Integer> node7 = new DNode<Integer>(2);
        dll.insertHead(node);
        assertEquals(1, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node, dll.getTail());

        dll.sortedInsert(node7);
        assertEquals(2, dll.getSize());
        assertEquals(node, dll.getHead());
        assertEquals(node7, dll.getTail());
        dll.clear();

        DNode<Integer> node2 = new DNode<Integer>(2);
        DNode<Integer> node3 = new DNode<Integer>(3);
        dll.insertHead(node);
        dll.insertHead(node2);
        dll.insertHead(node3);
        assertEquals(3, dll.getSize());
        assertEquals(node3, dll.getHead());
        assertEquals(node, dll.getTail());

        DNode<Integer> node4 = new DNode<Integer>(4);
        dll.sortedInsert(node4);
        assertEquals(4, dll.getSize());
        assertEquals(node.getData(), dll.getHead().getData());
        assertEquals(node4, dll.getTail());
        ;
    }

    //
    



    
}
