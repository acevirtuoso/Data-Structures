package tests;
import datastructures.tree.*;
import datastructures.nodes.TNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class BSTtest {
    //test for BST constructor
    @Test
    public void testBST() {
        BST tree = new BST();
        assertNull(tree.getRoot());
    }

    //test overloaded constructor
    @Test
    public void testBST2() {
        TNode node = new TNode(1, 0, null, null, null);
        BST tree = new BST(node);
        assertEquals(node, tree.getRoot());
    }

    //test for insert
    @Test
    public void testInsert() {
        BST tree = new BST();
        tree.insert(1);
        assertEquals(1, tree.getRoot().getData()); 
    }

    //test for insert with node
    @Test
    public void testInsert2() {
        TNode node = new TNode(1, 0, null, null, null);
        BST tree = new BST();
        tree.insert(node);
        assertEquals(node, tree.getRoot());
    }

    //test for delete
    @Test
    public void testDelete() {
        BST tree = new BST();
        tree.insert(1);
        tree.delete(1);
        assertNull(tree.getRoot());
    }

    //test for search
    @Test
    public void testSearch() {
        BST tree = new BST();
        tree.insert(1);
        assertEquals(1, tree.Search(1).getData());
    }

    //test for getRoot
    @Test
    public void testGetRoot() {
        BST tree = new BST();
        tree.insert(1);
        assertEquals(1, tree.getRoot().getData());
    }

    //test for setRoot
    @Test
    public void testSetRoot() {
        BST tree = new BST();
        TNode node = new TNode(1, 0, null, null, null);
        tree.setRoot(node);
        assertEquals(node, tree.getRoot());
    }



    
}
