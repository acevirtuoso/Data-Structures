package datastructures.tree;
import datastructures.nodes.TNode;

import java.util.Queue;
import java.util.LinkedList;

public class BST{
    private TNode root;

    public BST() {
        root = null;
    }

    public BST(int val) {
        root = new TNode(val, 0, null, null, null);
    }

    public BST(TNode obj) {
        root = obj;
    }

    public TNode getRoot() {
        return root;
    }

    public void setRoot(TNode root) {
        this.root = root;
    }

    public void insert(int val) {
        TNode newNode = new TNode(val, 0, null, null, null);
        if (root == null) {
            root = newNode;
        } else {
            TNode current = root;
            while (true) {
                if (val < current.getData()) {
                    if (current.getLeft() == null) {
                        current.setLeft(newNode);
                        newNode.setParent(current);
                        break;
                    }
                    current = current.getLeft();
                } else if (val > current.getData()) {
                    if (current.getRight() == null) {
                        current.setRight(newNode);
                        newNode.setParent(current);
                        break;
                    }
                    current = current.getRight();
                } else {
                    break;
                }
            }
        }
    }

    public void insert(TNode node) {
        if (root == null) {
            root = node;
        } else {
            TNode current = root;
            while (true) {
                if (node.getData() < current.getData()) {
                    if (current.getLeft() == null) {
                        current.setLeft(node);
                        node.setParent(current);
                        break;
                    }
                    current = current.getLeft();
                } else if (node.getData() > current.getData()) {
                    if (current.getRight() == null) {
                        current.setRight(node);
                        node.setParent(current);
                        break;
                    }
                    current = current.getRight();
                } else {
                    break;
                }
            }
        }
    }

    public void delete(int val) {
        TNode current = root;
        TNode parent = null;
        boolean isLeftChild = false;

        while (current != null && current.getData() != val) {
            parent = current;
            if (val < current.getData()) {
                current = current.getLeft();
                isLeftChild = true;
            } else {
                current = current.getRight();
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Value " + val + " is not in the tree.");
            return;
        } else {
            // Case 1: Node to be deleted has no children
            if (current.getLeft() == null && current.getRight() == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.setLeft(null);
                    } else {
                        parent.setRight(null);
                    }
                }
            }
            // Case 2: Node to be deleted has only one child
            else if (current.getRight() == null) {
                if (current == root) {
                    root = current.getLeft();
                } else if (isLeftChild) {
                    parent.setLeft(current.getLeft());
                } else {
                    parent.setRight(current.getLeft());
                }
            } else if (current.getLeft() == null) {
                if (current == root) {
                    root = current.getRight();
                } else if (isLeftChild) {
                    parent.setLeft(current.getRight());
                } else {
                    parent.setRight(current.getRight());
                }
            }
            // Case 3: Node to be deleted has two children
            else {
                TNode successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else if (isLeftChild) {
                    parent.setLeft(successor);
                } else {
                    parent.setRight(successor);
                }
                successor.setLeft(current.getLeft());
            }
        }
    }

    private TNode getSuccessor(TNode node) {
        TNode successor = null;
        TNode successorParent = node;
        TNode current = node.getRight();
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeft();
        }
        if (successor != node.getRight()) {
            successorParent.setLeft(successor.getRight());
            successor.setRight(node.getRight());
        }
        return successor;
    }

    public TNode Search(int val) {
        TNode current = root;
        while (current != null) {
            if (val == current.getData()) {
                return current;
            } else if (val < current.getData()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        return null;
    }

    public void printInOrder() {
        printInOrder(root);
    }
    
    private void printInOrder(TNode node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.print(node.getData() + " ");
            printInOrder(node.getRight());
        }
    }

    public void printBF() {
        if (root == null) {
            return;
        }
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TNode node = queue.poll();
                System.out.print(node.getData() + " ");
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
            System.out.println();
        }
    }
    
    
    

}
