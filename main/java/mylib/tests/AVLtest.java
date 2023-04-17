package tests;
import datastructures.tree.*;
import datastructures.nodes.TNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class AVLtest {

    //test the AVL constructor
    @Test
    public void testAVL() {
        AVL tree = new AVL();
        assertNull(tree.getRoot());
    }

    //test overloaded constructor
    @Test
    public void testAVL2() {
        TNode node = new TNode(1, 0, null, null, null);
        AVL tree = new AVL(node);
        assertEquals(node, tree.getRoot());
    }

    //test the avl constructor with an integer value
    @Test
    public void testAVL3() {
        AVL tree = new AVL(1);
        assertEquals(1, tree.getRoot().getData());
    }

    //test for insert
    @Test
    public void testInsert() {
        AVL tree = new AVL();
        tree.insert(1);
        assertEquals(1, tree.getRoot().getData()); 
    }

    //test for setRoot
    @Test
    public void testSetRoot() {
        AVL tree = new AVL();
        TNode node = new TNode(1, 0, null, null, null);
        tree.setRoot(node);
        assertEquals(node, tree.getRoot());
    }

    //test for insert with node
    @Test
    public void testInsert2() {
        TNode node = new TNode(1, 0, null, null, null);
        AVL tree = new AVL();
        tree.insert(node);
        assertEquals(node, tree.getRoot());
    }

    //test for delete
    @Test
    public void testDelete() {
        AVL tree = new AVL();
        tree.insert(1);
        tree.delete(1);
        assertNull(tree.getRoot());
    }


    //test for search
    @Test
    public void testSearch() {
        AVL tree = new AVL();
        tree.insert(1);
        assertEquals(1, tree.Search(1).getData());
    }

    //test the balance
    @Test
    public void testBalance() {
        AVL avl = new AVL();
        avl.insert(1);
        avl.insert(2);
        avl.insert(3);
        
        // The tree should be balanced after these insertions
        assertEquals(2, avl.getRoot().getData());
        assertEquals(1, avl.getRoot().getLeft().getData());
        assertEquals(3, avl.getRoot().getRight().getData());
        
        avl.insert(4);
        avl.insert(5);
        
        // The tree should be balanced after these insertions
        assertEquals(3, avl.getRoot().getData());
        assertEquals(2, avl.getRoot().getLeft().getData());
        assertEquals(1, avl.getRoot().getLeft().getLeft().getData());
    }




    
}
