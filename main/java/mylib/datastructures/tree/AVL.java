package datastructures.tree;
import datastructures.nodes.TNode;

public class AVL extends BST {

    private TNode root;

    public AVL() {
        root = null;
    }

    public AVL(int val) {
        root = new TNode(val, 0, null, null, null);
    }

    public AVL(TNode obj) {
        root = obj;
        if (obj.getLeft() != null || obj.getRight() != null) {
            balance();
        }
    }

    @Override
    public void setRoot(TNode node) {
        root = node;
        if (node.getLeft() != null || node.getRight() != null) {
            balance();
        }
    }

    @Override
    public TNode getRoot() {
        return root;
    }

    @Override
    public void insert(int val) {
        BST bst = new BST(root);
        bst.insert(val);
        root = bst.getRoot();
        balance();
    }

    @Override
    public void insert(TNode node) {
        BST bst = new BST(root);
        bst.insert(node);
        root = bst.getRoot();
        balance();
    }

    @Override
    public void delete(int val) {
        BST bst = new BST(root);
        bst.delete(val);
        root = bst.getRoot();
        balance();
    }

    @Override
    public TNode Search(int val) {
        BST bst = new BST(root);
        return bst.Search(val);
    }

    public void printInOrder() {
        BST bst = new BST(root);
        bst.printInOrder();
    }

    public void printBF() {
        BST bst = new BST(root);
        bst.printBF();
    }

    private int height(TNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.getLeft());
            int rightHeight = height(node.getRight());
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    
    // Helper function to calculate the balance factor of a node
    private int balanceFactor(TNode node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.getLeft());
            int rightHeight = height(node.getRight());
            return leftHeight - rightHeight;
        }
    }
    
    // Helper function to rotate the tree right
    private TNode rotateRight(TNode node) {
        TNode temp = node.getLeft();
        node.setLeft(temp.getRight());
        temp.setRight(node);
        return temp;
    }
    
    // Helper function to rotate the tree left
    private TNode rotateLeft(TNode node) {
        TNode temp = node.getRight();
        node.setRight(temp.getLeft());
        temp.setLeft(node);
        return temp;
    }
    
    // Helper function to balance the AVL tree

    private void balance() {
        TNode root = getRoot();
        if (root == null) {
            return;
        }
        
        int balanceFactor = balanceFactor(root);
        if (balanceFactor > 1) {
            if (balanceFactor(root.getLeft()) < 0) {
                root.setLeft(rotateLeft(root.getLeft()));
            }
            setRoot(rotateRight(root));
        } else if (balanceFactor < -1) {
            if (balanceFactor(root.getRight()) > 0) {
                root.setRight(rotateRight(root.getRight()));
            }
            setRoot(rotateLeft(root));
        }
    }

}

