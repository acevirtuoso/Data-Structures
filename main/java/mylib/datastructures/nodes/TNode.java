package datastructures.nodes;


public class TNode {
    private int data;
    private TNode left;
    private TNode right;
    private TNode parent;
    private int balance;

    // default constructor
    public TNode() {
        data = 0;
        left = null;
        right = null;
        parent = null;
        balance = 0;
    }

    // overload constructor
    public TNode(int data, int balance, TNode P, TNode L, TNode R) {
        this.data = data;
        this.balance = balance;
        this.parent = P;
        this.left = L;
        this.right = R;
    }

    // setters
    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(TNode left) {
        this.left = left;
    }

    public void setRight(TNode right) {
        this.right = right;
    }

    public void setParent(TNode parent) {
        this.parent = parent;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // getters
    public int getData() {
        return data;
    }

    public TNode getLeft() {
        return left;
    }

    public TNode getRight() {
        return right;
    }

    public TNode getParent() {
        return parent;
    }

    public int getBalance() {
        return balance;
    }

    // print method
    public void print() {
        System.out.println("Node Data: " + data);
        System.out.println("Node Balance: " + balance);
        if (parent != null) {
            System.out.println("Parent Data: " + parent.getData());
        } else {
            System.out.println("No Parent");
        }
        if (left != null) {
            System.out.println("Left Child Data: " + left.getData());
        } else {
            System.out.println("No Left Child");
        }
        if (right != null) {
            System.out.println("Right Child Data: " + right.getData());
        } else {
            System.out.println("No Right Child");
        }
        System.out.println();
    }

    // toString method
    public String toString() {
        return Integer.toString(data);
    }
}
