package datastructures.linear;
import datastructures.nodes.*;

public class StackLL<x extends Comparable<x>> extends SLL<x> {
    public StackLL() {
        super();
    }

    public StackLL(DNode<x> head) {
        super(head);
    }

    @Override
    public void insertTail(DNode<x> node) {
        // Empty body method, as InsertTail is not applicable for Stack
    }

    public void push(DNode<x> node) {
        super.insertHead(node);
    }

    public void pop() {
        super.deleteHead();
    }

    public DNode<x> peek() {
        return super.getHead();
    }

    @Override
    public void insert(DNode<x> node, int position) {
        // Empty body method, as Insert is not applicable for Stack
    }

    // @Override
    // public  Delete(DNode<x> node) {
    //     // Empty body method, as Delete is not applicable for Stack
    // }

    @Override
    public void sort() {
        // Empty body method, as Sort is not applicable for Stack
    }

    @Override
    public void clear() {
        super.setHead(null);
    }

    @Override
    public void print() {
        System.out.println("Stack length: " + super.getSize());
        System.out.println("Stack content:");
        super.print();
    }

    
}
