package tests;
import datastructures.linear.*;
import datastructures.nodes.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackLLtest {

    //test for StackLL constructor
    @Test
    public void testStackLL() {
        StackLL<Integer> list = new StackLL<>();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
        assertNull(list.getTail());
    }

    //test for StackLL constructor with node
    @Test
    public void testStackLL2() {
        DNode<Integer> node = new DNode<>(1);
        StackLL<Integer> list = new StackLL<>(node);
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
    }

    //test for push
    @Test
    public void testPush() {
        DNode<Integer> node = new DNode<>(1);
        StackLL<Integer> list = new StackLL<>();
        list.push(node);
        assertEquals(1, list.getSize());
        assertEquals(node, list.getHead());
        assertEquals(node, list.getTail());
    }

    //test for pop
    @Test
    public void testPop() {
        DNode<Integer> node = new DNode<>(1);
        StackLL<Integer> list = new StackLL<>(node);
        list.pop();
        assertEquals(0, list.getSize());
        assertNull(list.getHead());
    }

    //test for peek
    @Test
    public void testPeek() {
        DNode<Integer> node = new DNode<>(1);
        StackLL<Integer> list = new StackLL<>(node);
        assertEquals(node, list.peek());
    }

}
